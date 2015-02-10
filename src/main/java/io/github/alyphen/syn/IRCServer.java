package io.github.alyphen.syn;

import io.github.alyphen.syn.listener.*;
import org.pircbotx.Configuration;
import org.pircbotx.PircBotX;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Collections.unmodifiableList;

public class IRCServer {

    private PircBotX bot;

    private IRCClient client;
    private IRCUser user;
    private String quitMessage;

    private String address;
    private int port;

    private Map<String, IRCChannel> channels;

    public IRCServer(IRCClient client, IRCUser user, String address, int port, String quitMessage) {
        this.client = client;
        this.user = user;
        user.setServer(this);
        this.address = address;
        this.port = port;
        this.quitMessage = quitMessage;
        channels = new HashMap<>();
        bot = new PircBotX(
                new Configuration.Builder<>()
                        .setName(user.getName())
                        .setLogin(user.getLogin())
                        .setVersion(client.getVersion())
                        .setRealName(user.getRealName())
                        .setFinger(user.getFinger())
                        .setAutoNickChange(true)
                        .setAutoReconnect(true)
                        .setAutoSplitMessage(true)
                        .setNickservPassword(user.getPassword())
                        .setServerHostname(address)
                        .setServerPort(port)
                        .addListener(new IRCActionListener())
                        .addListener(new IRCBanListListener())
                        .addListener(new IRCChannelInfoListener())
                        .addListener(new IRCConnectListener())
                        .addListener(new IRCDisconnectListener())
                        .addListener(new IRCFingerListener())
                        .addListener(new IRCHalfOpListener())
                        .addListener(new IRCIncomingChatRequestListener())
                        .addListener(new IRCIncomingFileTransferListener())
                        .addListener(new IRCInviteListener())
                        .addListener(new IRCJoinListener(client))
                        .addListener(new IRCKickListener())
                        .addListener(new IRCMessageListener())
                        .addListener(new IRCModeListener())
                        .addListener(new IRCMOTDListener())
                        .addListener(new IRCNickAlreadyInUseListener())
                        .addListener(new IRCNickChangeListener())
                        .addListener(new IRCNoticeListener())
                        .addListener(new IRCOpListener())
                        .addListener(new IRCOwnerListener())
                        .addListener(new IRCPartListener())
                        .addListener(new IRCPrivateMessageListener())
                        .addListener(new IRCQuitListener())
                        .addListener(new IRCRemoveChannelBanListener())
                        .addListener(new IRCRemoveChannelKeyListener())
                        .addListener(new IRCRemoveChannelLimitListener())
                        .addListener(new IRCRemoveInviteOnlyListener())
                        .addListener(new IRCRemoveModeratedListener())
                        .addListener(new IRCRemoveNoExternalMessagesListener())
                        .addListener(new IRCRemovePrivateListener())
                        .addListener(new IRCRemoveSecretListener())
                        .addListener(new IRCRemoveTopicProtectionListener())
                        .addListener(new IRCSetChannelBanListener())
                        .addListener(new IRCSetChannelKeyListener())
                        .addListener(new IRCSetChannelLimitListener())
                        .addListener(new IRCSetInviteOnlyListener())
                        .addListener(new IRCSetModeratedListener())
                        .addListener(new IRCSetNoExternalMessagesListener())
                        .addListener(new IRCSetPrivateListener())
                        .addListener(new IRCSetSecretListener())
                        .addListener(new IRCSetTopicProtectionListener())
                        .addListener(new IRCSocketConnectListener())
                        .addListener(new IRCSuperOpListener())
                        .addListener(new IRCTopicListener())
                        .addListener(new IRCUserListListener())
                        .addListener(new IRCUserModeListener())
                        .addListener(new IRCVoiceListener())
                        .addListener(new IRCWhoisListener())
                        .buildConfiguration()
        );
    }

    public String getAddress() {
        return address;
    }

    public int getPort() {
        return port;
    }

    public void joinChannel(String channel) {
        bot.sendIRC().joinChannel(channel);
    }

    public void leaveChannel(String channel) {
        if (channels.containsKey(channel)) {
            channels.get(channel).leave();
        }
    }

    public IRCChannel getChannel(String name) {
        return channels.get(name);
    }

    public List<String> listChannels() {
        List<String> channels = new ArrayList<>();
        channels.addAll(this.channels.keySet());
        channels.sort(String::compareTo);
        return unmodifiableList(channels);
    }

    public void disconnect() {
        bot.sendIRC().quitServer(quitMessage);
    }

    public void updateNick() {
        bot.sendIRC().changeNick(user.getName());
    }

}
