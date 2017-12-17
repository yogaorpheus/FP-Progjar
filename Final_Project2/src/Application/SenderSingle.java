package Application;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class SenderSingle {
    private DatagramSocket socket;
    private static SenderSingle ourInstance = new SenderSingle();
    public static SenderSingle getInstance(){
        return ourInstance;
    }

    private SenderSingle() {
        try {
            socket = new DatagramSocket(5002);
        } catch (SocketException e) {
            e.printStackTrace();
            System.exit(500);
        }
    }

    public void sendMessage(String message, InetAddress targetAddress, Integer targetPort) {
        try {
            DatagramPacket packet = new DatagramPacket(message.getBytes(), message.getBytes().length, targetAddress, targetPort);
            socket.send(packet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
