package io.github.alyphen.syn.listener;

import org.pircbotx.PircBotX;
import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.WhoisEvent;

public class IRCWhoisListener extends ListenerAdapter<PircBotX> {

    @Override
    public void onWhois(WhoisEvent<PircBotX> event) throws Exception {

    }

}
