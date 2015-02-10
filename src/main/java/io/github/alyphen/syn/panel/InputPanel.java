package io.github.alyphen.syn.panel;

import io.github.alyphen.syn.IRCClient;

import javax.swing.*;
import java.awt.*;

import static java.awt.BorderLayout.CENTER;

public class InputPanel extends JPanel {

    private IRCClient client;

    private JTextField textField;

    public InputPanel(IRCClient client) {
        this.client = client;
        setLayout(new BorderLayout());
        textField = new JTextField();
        add(textField, CENTER);
    }

}
