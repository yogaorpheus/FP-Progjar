package Application;

import Config.Constants;
import ViewTemp.AddQuestion;
import ViewTemp.CommandCenter;

import javax.swing.*;
import java.net.DatagramSocket;
import java.net.SocketException;

public class App {

    public App()  {
        ListenThread listener = new ListenThread();
        System.out.println("test");
        listener.start();
//        new AddQuestion();
        CommandCenter mainMenu = new CommandCenter();
        Quiz.getInstance().setMainFrame(mainMenu);
        mainMenu.setVisible(true);
    }
}
