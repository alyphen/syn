package io.github.alyphen.syn.listener;

import io.github.alyphen.syn.IRCClient;
import io.github.alyphen.syn.IRCServer;
import org.pircbotx.PircBotX;
import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.JoinEvent;

public class IRCJoinListener extends ListenerAdapter<PircBotX> {

    private IRCClient client;

    public IRCJoinListener(IRCClient client) {
        this.client = client;
    }

    @Override
    public void onJoin(JoinEvent<PircBotX> event) throws Exception {
        for (IRCServer server : client.getServers()) {
            client.getChannelTreePanel().updateServer(server);
        }
    }

}
