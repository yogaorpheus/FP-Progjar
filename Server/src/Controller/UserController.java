package Controller;

import Model.Database;
import Model.User;

public class UserController {
    public static User findByName (String username) {
        for (User user: Database.getInstance().getUsers()) {
            if (user.getUsername().equals(username)) return user;
        }
        return null;
    }

    public static User register (String username, String password) {
        User user = new User(username, password);
        Database.getInstance().addUser(user);
        Database.getInstance().saveDatabase();
        return user;
    }
}
