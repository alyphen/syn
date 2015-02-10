package io.github.alyphen.syn.listener;

import org.pircbotx.PircBotX;
import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.RemoveNoExternalMessagesEvent;

public class IRCRemoveNoExternalMessagesListener extends ListenerAdapter<PircBotX> {

    @Override
    public void onRemoveNoExternalMessages(RemoveNoExternalMessagesEvent<PircBotX> event) throws Exception {

    }

}
