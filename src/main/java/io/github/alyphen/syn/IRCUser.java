package io.github.alyphen.syn;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IRCUser {

    private String name;
    private String login;
    private String realName;
    private String finger;
    private IRCServer server;
    private String password;

    public IRCUser(String name, String login, String realName, String finger, String password) {
        this.name = name;
        this.login = login;
        this.realName = realName;
        this.finger = finger;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        server.updateNick();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getFinger() {
        return finger;
    }

    public void setFinger(String finger) {
        this.finger = finger;
    }

    public String getPassword() {
        return password;
    }

    public IRCServer getServer() {
        return server;
    }

    public void setServer(IRCServer server) {
        this.server = server;
    }

}
