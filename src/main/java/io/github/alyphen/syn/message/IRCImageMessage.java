package io.github.alyphen.syn.message;

import java.awt.image.BufferedImage;

public class IRCImageMessage extends IRCMessage {

    private BufferedImage image;

    public IRCImageMessage(String text, BufferedImage image) {
        super(text);
        this.image = image;
    }

    public BufferedImage getImage() {
        return image;
    }

}
