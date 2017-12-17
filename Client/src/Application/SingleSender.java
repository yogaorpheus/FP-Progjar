package Application;

import Config.Constants;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class SingleSender {
    public static void sendMessage(String message) {
        try {
            DatagramSocket socket = Constants.socket;
            byte[] buf = message.getBytes();
            DatagramPacket packet = null;
            packet = new DatagramPacket(buf, buf.length, InetAddress.getByName("127.0.0.1"), 5001);
            socket.send(packet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
