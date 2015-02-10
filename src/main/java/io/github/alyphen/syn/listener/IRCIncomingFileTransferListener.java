package io.github.alyphen.syn.listener;

import org.pircbotx.PircBotX;
import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.IncomingFileTransferEvent;

import javax.swing.*;
import java.io.File;

import static java.lang.String.format;
import static java.lang.System.getProperty;
import static javax.swing.JFileChooser.APPROVE_OPTION;
import static javax.swing.JOptionPane.*;

public class IRCIncomingFileTransferListener extends ListenerAdapter<PircBotX> {

    @Override
    public void onIncomingFileTransfer(IncomingFileTransferEvent<PircBotX> event) throws Exception {
        if (showConfirmDialog(null, format("Accept file %s from %s?", event.getSafeFilename(), event.getUser().getNick()), "Accept file transfer?", YES_NO_OPTION) == YES_OPTION) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setSelectedFile(new File(getProperty("user.home"), event.getSafeFilename()));
            if (fileChooser.showSaveDialog(null) == APPROVE_OPTION) {
                event.accept(fileChooser.getSelectedFile());
            }
        }
    }
}
