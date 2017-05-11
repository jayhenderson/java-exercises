package org.launchcode.java.studios.quiz;

/**
 * Created by J on 3/20/2017.
 */
public class TrueFalseQuestion extends AbstractQuestion{
    private boolean answer;
    private boolean input;

    TrueFalseQuestion(String question, boolean answer) {
        super(question);
        this.answer = answer;
    }

    public void setInput(boolean input) {
        this.input = input;
    }

    @Override
    public boolean checkAnswer() {
        return input == answer;
    }
}
