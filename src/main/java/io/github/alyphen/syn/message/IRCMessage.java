package io.github.alyphen.syn.message;

public class IRCMessage {

    private String text;

    public IRCMessage(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

}
