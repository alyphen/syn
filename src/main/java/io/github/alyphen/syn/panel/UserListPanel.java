package io.github.alyphen.syn.panel;

import io.github.alyphen.syn.IRCClient;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class UserListPanel extends JPanel {

    private IRCClient client;

    private JTable userTable;

    public UserListPanel(IRCClient client) {
        this.client = client;
        userTable = new JTable(new DefaultTableModel(0, 1) {
            @Override
            public String getColumnName(int column) {
                return "Users";
            }
        });
        JScrollPane scrollPane = new JScrollPane(userTable);
        scrollPane.setPreferredSize(new Dimension(64, 512));
        add(scrollPane);
    }
}
