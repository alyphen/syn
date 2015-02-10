package io.github.alyphen.syn.panel;

import io.github.alyphen.syn.IRCChannel;
import io.github.alyphen.syn.IRCServer;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;

public class ChannelTreePanel extends JPanel {

    private JTree channelTree;
    private DefaultMutableTreeNode rootNode;

    public ChannelTreePanel() {
        rootNode = new DefaultMutableTreeNode("Servers");
        channelTree = new JTree(rootNode);
        add(channelTree);
    }

    private class IRCServerTreeNode extends DefaultMutableTreeNode {
        private IRCServer server;

        public IRCServerTreeNode(IRCServer server) {
            super(server.getAddress());
            this.server = server;
        }

        public IRCServer getServer() {
            return server;
        }
    }

    private class IRCChannelTreeNode extends DefaultMutableTreeNode {
        private IRCChannel channel;

        public IRCChannelTreeNode(IRCChannel channel) {
            super(channel.getName());
            this.channel = channel;
        }

        public IRCChannel getChannel() {
            return channel;
        }
    }

    public void addServer(IRCServer server) {
        rootNode.add(new IRCServerTreeNode(server));
    }

    public void updateServer(IRCServer server) {
        for (int i = 0; i < rootNode.getChildCount(); i++) {
            TreeNode node1 = rootNode.getChildAt(i);
            if (node1 instanceof IRCServerTreeNode) {
                IRCServerTreeNode ircServerTreeNode = (IRCServerTreeNode) node1;
                if (server == ircServerTreeNode.getServer()) {
                    ircServerTreeNode.removeAllChildren();
                    for (String channel : server.listChannels()) {
                        ircServerTreeNode.add(new IRCChannelTreeNode(server.getChannel(channel)));
                    }
                }
            }
        }
    }

}
