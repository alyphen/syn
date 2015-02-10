package io.github.alyphen.syn;

import io.github.alyphen.syn.message.IRCMessage;
import org.pircbotx.Channel;
import org.pircbotx.PircBotX;

import java.util.ArrayList;
import java.util.List;

public class IRCChannel implements Comparable<IRCChannel> {

    private IRCServer server;
    private String name;
    private List<IRCMessage> messages;
    private Channel pircBotXChannel;

    public IRCChannel(IRCServer server, String name) {
        this.server = server;
        this.name = name;
        messages = new ArrayList<>();
    }

    public IRCServer getServer() {
        return server;
    }

    public String getName() {
        return name;
    }

    public void addMessage(IRCMessage message) {
        messages.add(message);
    }

    public List<IRCMessage> getMessages() {
        return messages;
    }

    public Channel getPircBotXChannel() {
        return pircBotXChannel;
    }

    public void setPircBotXChannel(Channel pircBotXChannel) {
        this.pircBotXChannel = pircBotXChannel;
    }

    public void leave() {
        getPircBotXChannel().send().part();
    }

    public void join(PircBotX bot) {
        bot.sendIRC().joinChannel(getName());
    }

    @Override
    public int compareTo(IRCChannel channel) {
        return getName().compareTo(channel.getName());
    }

}
