package Application;

public class Data {
    private static Data ourInstance = new Data();
    private String username = null;
    private String tempUsername = null;

    public static Data getInstance() {
        return ourInstance;
    }

    private Data() {
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String getTempUsername() {
        return tempUsername;
    }

    public void setTempUsername(String tempUsername) {
        this.tempUsername = tempUsername;
    }
}
