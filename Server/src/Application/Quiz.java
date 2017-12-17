package Application;

import Controller.QuestionController;
import Model.Question;
import Model.User;
import Util.MessageGenerator;
import ViewTemp.CommandCenter;
import sun.awt.windows.ThemeReader;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Quiz extends Thread{
    private static Quiz ourInstance = new Quiz();
    private CommandCenter mainFrame;
    private Question activeQuestion;
    private List<String> usersAnswer;
    private boolean isActive;
    private Set<User> activeUser;

    public static Quiz getInstance() {
        return ourInstance;
    }

    private Quiz () {
        isActive = false;
        usersAnswer = new ArrayList<>();
        activeUser = new HashSet<>();
    }

    public boolean status() {
        return isActive;
    }

    public void setMainFrame(CommandCenter mainFrame) {
        this.mainFrame = mainFrame;
    }

    public Set<User> getActiveUser() {
        return activeUser;
    }

    public void addActiveUser(User user) {
        activeUser.add(user);
        mainFrame.updateActiveUserList(activeUser);
    }

    public void removeActiveUser(User user) {
        activeUser.remove(user);
        mainFrame.updateActiveUserList(activeUser);
    }

    public Question getActiveQuestion() {
        return activeQuestion;
    }

    public List<String> getUsersAnswer() {
        return usersAnswer;
    }

    public Question startQuiz() {
        refreshQuestion();
        isActive = true;
        return activeQuestion;
    }

    public void endQuiz() {
        isActive = false;
    }

    private class QuizTimer extends Thread {
        public QuizTimer() {}

        public void run() {
            try {
                sleep(10000);
                if (Quiz.getInstance().status()) {
                    Quiz.getInstance().refreshQuestion();
                    Broadcaster.getInstance().broadcast(MessageGenerator.activeQuestion(Quiz.getInstance().getActiveQuestion(), Quiz.getInstance().getUsersAnswer()));
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void refreshQuestion() {
        activeQuestion = QuestionController.getRandom();
        usersAnswer.clear();
        new QuizTimer().start();
    }
}
