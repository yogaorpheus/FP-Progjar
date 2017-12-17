package Model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Database implements Serializable {
    private static Database ourInstance = Database.loadDatabase();
    private List<Question> questions;
    private List<User> users;

    public static Database getInstance() {
        return ourInstance;
    }

    private Database() {
        this.users = new ArrayList<>();
        this.questions = new ArrayList<>();
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public List<User> getUsers() {
        return users;
    }

    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public void saveDatabase() {
        try {
            FileOutputStream fileOut = new FileOutputStream("./data/database.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this);
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Database loadDatabase() {
        Database database;
        try {
            FileInputStream fileIn = new FileInputStream("./data/database.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            database = (Database) in.readObject();
            in.close();
            fileIn.close();
        } catch (ClassNotFoundException | IOException e) {
            database = new Database();
            e.printStackTrace();
        }
        return database;
    }
}
