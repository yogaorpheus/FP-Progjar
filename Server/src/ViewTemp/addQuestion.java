package ViewTemp;

import Controller.QuestionController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addQuestion {
    private JTextField questionText;
    private JPanel mainPanel;
    private JTextField questionAnswer;
    private JTextArea questionDecoys;
    private JButton submitButton;

    public addQuestion() {
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                QuestionController.handleFormAddQuestion(questionText.getText(), questionAnswer.getText());
            }
        });
    }
}
