package io.github.alyphen.syn.listener;

import org.pircbotx.PircBotX;
import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.SocketConnectEvent;

public class IRCSocketConnectListener extends ListenerAdapter<PircBotX> {

    @Override
    public void onSocketConnect(SocketConnectEvent<PircBotX> event) throws Exception {

    }
}
