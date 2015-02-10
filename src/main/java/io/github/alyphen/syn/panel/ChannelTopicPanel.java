package io.github.alyphen.syn.panel;

import javax.swing.*;
import java.awt.*;

public class ChannelTopicPanel extends JPanel {

    public static final int X_OFFSET = 8;
    public static final int Y_OFFSET = 8;

    private String topic;

    public ChannelTopicPanel() {
        topic = "I like potatoes";
        setPreferredSize(new Dimension(640, 32));
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        graphics.setColor(Color.BLACK);
        graphics.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
        graphics.drawString(getTopic(), X_OFFSET, Y_OFFSET + graphics.getFontMetrics().getMaxAscent() + graphics.getFontMetrics().getLeading());
    }
}
