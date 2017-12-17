package Application;

import GUI.ChatBoxTest;
import GUI.GUIController;

import javax.swing.*;

public class App {
    public App() {
//        JFrame frame = new ChatBoxTest();
        GUIController.getInstance().showLogin();
        new SingleListener().start();
        new BroadcastListener().start();
    }
}
