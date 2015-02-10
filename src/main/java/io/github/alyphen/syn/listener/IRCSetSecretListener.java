package io.github.alyphen.syn.listener;

import org.pircbotx.PircBotX;
import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.SetSecretEvent;

public class IRCSetSecretListener extends ListenerAdapter<PircBotX> {

    @Override
    public void onSetSecret(SetSecretEvent<PircBotX> event) throws Exception {

    }

}
