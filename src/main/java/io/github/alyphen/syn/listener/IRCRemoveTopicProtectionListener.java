package io.github.alyphen.syn.listener;

import org.pircbotx.PircBotX;
import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.RemoveTopicProtectionEvent;

public class IRCRemoveTopicProtectionListener extends ListenerAdapter<PircBotX> {

    @Override
    public void onRemoveTopicProtection(RemoveTopicProtectionEvent<PircBotX> event) throws Exception {

    }

}
