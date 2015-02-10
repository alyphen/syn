package io.github.alyphen.syn.listener;

import org.pircbotx.PircBotX;
import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.NickAlreadyInUseEvent;

public class IRCNickAlreadyInUseListener extends ListenerAdapter<PircBotX> {

    @Override
    public void onNickAlreadyInUse(NickAlreadyInUseEvent<PircBotX> event) throws Exception {

    }

}
