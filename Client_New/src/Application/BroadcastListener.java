package Application;

import Config.Constants;
import GUI.GUIController;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class BroadcastListener extends Thread{
    private MulticastSocket listenerSocket;
    private InetAddress group;

    public BroadcastListener() {
        try {
            listenerSocket = new MulticastSocket(6003);
            group = InetAddress.getByName("224.0.0.1");
            listenerSocket.joinGroup(group);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void run() {
        while(true) {
            byte[] receiveData = new byte[512];
            DatagramPacket packet = new DatagramPacket(receiveData, receiveData.length);
            try {
                listenerSocket.receive(packet);
                String data = new String(packet.getData()).trim();
                GUIController.getInstance().appendChat(data);
                System.out.println("from broadcast -> " + data);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
