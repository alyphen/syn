package io.github.alyphen.syn.listener;

import org.pircbotx.PircBotX;
import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.RemoveChannelLimitEvent;

public class IRCRemoveChannelLimitListener extends ListenerAdapter<PircBotX> {

    @Override
    public void onRemoveChannelLimit(RemoveChannelLimitEvent<PircBotX> event) throws Exception {

    }

}
