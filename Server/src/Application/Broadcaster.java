package Application;

import Config.Constants;

import java.io.IOException;
import java.net.*;

public class Broadcaster {
    private DatagramSocket socket;

    private static Broadcaster ourInstance = new Broadcaster();

    public static Broadcaster getInstance() {
        return ourInstance;
    }

    private Broadcaster() {
        try {
            this.socket = new DatagramSocket(Constants.PORT);
        } catch (SocketException e) {
            e.printStackTrace();
            System.exit(500);
        }
    }

    public void broadcast(String message){
        byte[] buffer = new byte[512];
        DatagramPacket packet = null;
        try {
            packet = new DatagramPacket(buffer, buffer.length, InetAddress.getByName(Constants.IP_ADDR), Constants.PORT);
            socket.send(packet);
        } catch (IOException ignore) {}
    }
}
