package Controller;

import Model.Database;
import Model.Question;

import java.util.*;

public class QuestionController {
    public static void handleFormAddQuestion(String questionText, String answers) {
        questionText = questionText.trim();
        String[] answersArr = answers.trim().split(";");
        List<String> answerList = new ArrayList<>(Arrays.asList(answersArr));
        Question question = new Question(questionText, answerList);
        Database.getInstance().addQuestion(question);
        Database.getInstance().saveDatabase();
    }

    public static Question getRandom() {
        Random rand = new Random();
        rand.setSeed(5653);
        List<Question> questionList = Database.getInstance().getQuestions();
        return questionList.get(rand.nextInt(questionList.size()));
    }
}
