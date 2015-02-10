package io.github.alyphen.syn.listener;

import org.pircbotx.PircBotX;
import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.SetNoExternalMessagesEvent;

public class IRCSetNoExternalMessagesListener extends ListenerAdapter<PircBotX> {

    @Override
    public void onSetNoExternalMessages(SetNoExternalMessagesEvent<PircBotX> event) throws Exception {

    }

}
