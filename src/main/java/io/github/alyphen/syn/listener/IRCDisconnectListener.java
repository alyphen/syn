package io.github.alyphen.syn.listener;

import org.pircbotx.PircBotX;
import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.DisconnectEvent;

public class IRCDisconnectListener extends ListenerAdapter<PircBotX> {

    @Override
    public void onDisconnect(DisconnectEvent<PircBotX> event) throws Exception {
        super.onDisconnect(event);
    }

}
