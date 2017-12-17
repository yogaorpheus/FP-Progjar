package Application;

import Config.Constants;
import GUI.GUIController;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class SingleListener extends Thread {
    private DatagramSocket socket;

    public SingleListener() {

    }

    public void run() {
        while(true) {
            byte[] receiveData = new byte[512];
            DatagramPacket datagramPacket = new DatagramPacket(receiveData, receiveData.length);
            try {
                DatagramSocket socket = Constants.socket;
                socket.receive(datagramPacket);
            } catch (IOException e) {
                e.printStackTrace();
            }
            String data = new String(datagramPacket.getData()).trim();
            System.out.println(data);
            String type = data.split(";")[0];
            String status = data.split(";")[1];
            String message = data.split(";")[2];
            GUIController.getInstance().updateLoginStatus(message);
            if (type.equals("login") && status.equals("success")) {
                Data.getInstance().setUsername(Data.getInstance().getTempUsername());
                GUIController.getInstance().hideLogin();
                GUIController.getInstance().showChat();
            }
        }
    }
}
