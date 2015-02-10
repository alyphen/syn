package io.github.alyphen.syn.panel;

import javax.swing.*;
import java.awt.*;

import static java.awt.BorderLayout.CENTER;
import static java.awt.BorderLayout.NORTH;

public class ChannelDisplayPanel extends JPanel {

    private ChannelTopicPanel channelTopicPanel;
    private ChannelMessagesPanel channelMessagesPanel;

    public ChannelDisplayPanel() {
        setLayout(new BorderLayout());
        channelTopicPanel = new ChannelTopicPanel();
        add(channelTopicPanel, NORTH);
        channelMessagesPanel = new ChannelMessagesPanel();
        add(channelMessagesPanel, CENTER);
    }
}
