package GUI;

import Config.Constants;
import sun.security.krb5.Config;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.*;

public class ChatBoxTest extends JFrame{
    private JTextArea chatArea;
    private JPanel panel1;
    private JButton sendButton;
    private JTextField inputField;

    public ChatBoxTest() {
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                DatagramSocket socket = null;
                socket = Constants.socket;
                byte[] buf;
                buf = inputField.getText().getBytes();
                DatagramPacket packet = null;
                try {
                    packet = new DatagramPacket(buf, buf.length, InetAddress.getByName("127.0.0.1"), 5001);
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                }
                try {
                    socket.send(packet);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                inputField.setText("");
            }
        });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel1);
        setEnabled(true);
        setVisible(true);
    }

    public void addText(String text) {
        chatArea.append(text);
    }
}
