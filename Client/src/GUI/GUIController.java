package GUI;

public class GUIController {
    private static GUIController ourInstance = new GUIController();
    private LoginFrame loginFrame;
    private ChatFrame chatFrame;

    public static GUIController getInstance() {
        return ourInstance;
    }

    private GUIController() {
        loginFrame = new LoginFrame();
        chatFrame = new ChatFrame();
    }

    public void updateLoginStatus(String status) {
        loginFrame.setStatusField(status);
    }

    public void appendChat(String message) {
        chatFrame.appendChat(message);
    }

    public void showLogin() {
        loginFrame.setVisible(true);
    }

    public void hideLogin() {
        loginFrame.setVisible(false);
    }

    public void showChat() {
        chatFrame.setVisible(true);
    }

    public void hideChat() {
        chatFrame.setVisible(false);
    }

}
