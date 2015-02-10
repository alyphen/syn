package io.github.alyphen.syn;

import io.github.alyphen.syn.panel.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static java.awt.BorderLayout.*;
import static java.awt.EventQueue.invokeLater;

public class IRCClient extends JFrame {

    public static final String VERSION = "syn 0.1.0-SNAPSHOT";

    private List<IRCServer> servers;

    private ChannelTreePanel channelTreePanel;
    private ChannelDisplayPanel channelDisplayPanel;
    private UserListPanel userListPanel;
    private InputPanel inputPanel;

    public static void main(String[] args) {
        IRCClient client = new IRCClient();
        invokeLater(() -> client.setVisible(true));
    }

    public IRCClient() {
        servers = new ArrayList<>();
        setLayout(new BorderLayout());
        channelTreePanel = new ChannelTreePanel();
        add(channelTreePanel, WEST);
        channelDisplayPanel = new ChannelDisplayPanel();
        add(channelDisplayPanel, CENTER);
        userListPanel = new UserListPanel(this);
        add(userListPanel, EAST);
        inputPanel = new InputPanel(this);
        add(inputPanel, SOUTH);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public ChannelTreePanel getChannelTreePanel() {
        return channelTreePanel;
    }

    public ChannelDisplayPanel getChannelDisplayPanel() {
        return channelDisplayPanel;
    }

    public UserListPanel getUserListPanel() {
        return userListPanel;
    }

    public InputPanel getInputPanel() {
        return inputPanel;
    }

    public String getVersion() {
        return VERSION;
    }

    public List<IRCServer> getServers() {
        return servers;
    }

    public void addServer(IRCServer server) {
        getServers().add(server);
    }

}
