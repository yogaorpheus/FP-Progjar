package Application;

import Config.Constants;
import org.classpath.icedtea.Config;

import java.io.IOException;
import java.net.*;

public class Broadcaster {
    private MulticastSocket socket;
    private InetAddress groupAddress;

    private static Broadcaster ourInstance = new Broadcaster();

    public static Broadcaster getInstance() {
        return ourInstance;
    }

    private Broadcaster() {
        try {
            this.socket = new MulticastSocket(5003);
            groupAddress = InetAddress.getByName("224.0.0.1");
            socket.joinGroup(groupAddress);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(500);
        }
    }

    public void broadcast(String message){
        DatagramPacket packet;
        try {
            packet = new DatagramPacket(message.getBytes(), message.getBytes().length, groupAddress, 6003);
            socket.send(packet);
        } catch (IOException ignore) {}
    }
}
