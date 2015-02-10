package io.github.alyphen.syn.panel;

import io.github.alyphen.syn.IRCChannel;
import io.github.alyphen.syn.message.IRCImageMessage;
import io.github.alyphen.syn.message.IRCMessage;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

import static java.awt.Color.WHITE;

public class ChannelMessagesPanel extends JPanel {

    private static final int MESSAGE_X_OFFSET = 16;

    private IRCChannel channel;

    public ChannelMessagesPanel() {
        setPreferredSize(new Dimension(640, 480));
    }

    public IRCChannel getChannel() {
        return channel;
    }

    public void setChannel(IRCChannel channel) {
        this.channel = channel;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        if (getChannel() != null) {
            graphics.setColor(WHITE);
            int y = 0;
            for (IRCMessage message : getChannel().getMessages()) {
                graphics.drawString(message.getText(), MESSAGE_X_OFFSET, y);
                y += graphics.getFontMetrics().getHeight();
                if (message instanceof IRCImageMessage) {
                    BufferedImage image = ((IRCImageMessage) message).getImage();
                    graphics.drawImage(image, MESSAGE_X_OFFSET, y, null);
                    y += image.getHeight();
                }
            }
        }
    }
}
