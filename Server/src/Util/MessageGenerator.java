package Util;

import Model.Question;

import java.util.List;

public class MessageGenerator {
    public static String activeQuestion(Question question, List<String> answers) {
        String message = question.getText() + "\n";
        for (String answer : question.getAnswers()) {
            if (answers.contains(answer)) {
                message += answer + "\n";
            } else {
                message += "______" + "\n";
            }
        }
        return message;
    }
}
