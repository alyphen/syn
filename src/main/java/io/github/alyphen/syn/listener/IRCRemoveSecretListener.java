package io.github.alyphen.syn.listener;

import org.pircbotx.PircBotX;
import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.RemoveSecretEvent;

public class IRCRemoveSecretListener extends ListenerAdapter<PircBotX> {

    @Override
    public void onRemoveSecret(RemoveSecretEvent<PircBotX> event) throws Exception {

    }

}
