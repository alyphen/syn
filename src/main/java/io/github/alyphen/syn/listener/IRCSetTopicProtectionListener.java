package io.github.alyphen.syn.listener;

import org.pircbotx.PircBotX;
import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.SetTopicProtectionEvent;

public class IRCSetTopicProtectionListener extends ListenerAdapter<PircBotX> {

    @Override
    public void onSetTopicProtection(SetTopicProtectionEvent<PircBotX> event) throws Exception {

    }

}
