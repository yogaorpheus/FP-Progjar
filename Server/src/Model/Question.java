package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Question implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String text;
    private List<String> answers;

    public Question(String text, List<String> answers) {
        this.text = text;
        this.answers = answers;
    }

    public Integer getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public List<String> getAnswers() {
        return answers;
    }
}
