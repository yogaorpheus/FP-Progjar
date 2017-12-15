package Application;

import Config.Constants;

import java.net.DatagramSocket;
import java.net.SocketException;

public class App {
    private DatagramSocket socket;
    private ListenThread listener;

    public App() throws SocketException {
        this.socket = new DatagramSocket(Constants.PORT);
        this.listener = new ListenThread(this.socket);
        this.listener.start();
    }
}
