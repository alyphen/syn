package io.github.alyphen.syn.listener;

import org.pircbotx.PircBotX;
import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.RemoveInviteOnlyEvent;

public class IRCRemoveInviteOnlyListener extends ListenerAdapter<PircBotX> {

    @Override
    public void onRemoveInviteOnly(RemoveInviteOnlyEvent<PircBotX> event) throws Exception {

    }

}
