package Application;

import Controller.QuestionController;
import Model.Question;

import java.util.ArrayList;
import java.util.List;

public class Quiz extends Thread{
    private Question activeQuestion;
    private List<String> usersAnswer;
    private boolean isActive;

    public Quiz () {
        isActive = false;
        usersAnswer = new ArrayList<>();
    }

    public boolean status() {
        return isActive;
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

    public void refreshQuestion() {
        activeQuestion = QuestionController.getRandom();
        usersAnswer.clear();
    }

}
