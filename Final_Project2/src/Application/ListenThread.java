package Application;

import Model.Database;
import Model.User;
import Util.Handler;
import Util.MessageGenerator;
import ViewTemp.CommandCenter;

import java.io.IOException;
import java.net.*;

public class ListenThread extends Thread{
    private DatagramSocket socket;

    public ListenThread() {
        try {
            this.socket = new DatagramSocket(5001);
        } catch (SocketException e) {
            e.printStackTrace();
            System.exit(500);
        }
    }

    public void run() {
        Quiz quiz = Quiz.getInstance();

        while (true) {
            byte[] receiveData = new byte[512];
            DatagramPacket datagramPacket = new DatagramPacket(receiveData, receiveData.length);
            try {
                socket.receive(datagramPacket);
            } catch (IOException e) {
                e.printStackTrace();
            }
            String data = new String(datagramPacket.getData()).trim();
            System.out.println(data);
            String[] partition = data.split(";", 3);
            String senderName = partition[0];
            String messageType = partition[1];
            data = partition[2];
            if (messageType.equals("message")) {
                Handler.message(senderName, data);
            } else if (messageType.equals("register")) {
                Handler.register(data, datagramPacket.getAddress(), datagramPacket.getPort());
            } else if (messageType.equals("login")) {
                Handler.login(data, datagramPacket.getAddress(), datagramPacket.getPort());
            } else if (messageType.equals("logout")) {
                Handler.logout(senderName);
            }
            System.out.println("no problem");
        }
    }
}
