package io.github.alyphen.syn.listener;

import org.pircbotx.PircBotX;
import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.RemoveModeratedEvent;

public class IRCRemoveModeratedListener extends ListenerAdapter<PircBotX> {

    @Override
    public void onRemoveModerated(RemoveModeratedEvent<PircBotX> event) throws Exception {

    }

}
