package Model;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String username;
    private String password;
    private Integer points;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.points = 0;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPoints() {
        return points;
    }

    public void addPoints(Integer points) {
        this.points += points;
    }
}
