package Config;

import java.net.DatagramSocket;
import java.net.SocketException;

public class Constants {
    public static Integer PORT = 5001;
    public static String IP_ADDR = "127.0.0.1";
    public static String IP_MULTI = "224.0.0.123";
    public static Integer CLIENT_PORT = 5001;

    public static DatagramSocket socket;

    static {
        try {
            socket = new DatagramSocket();
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
