package org.launchcode.java.studios.quiz;

import java.util.ArrayList;

/**
 * Created by J on 3/20/2017.
 */
public class MultipleChoiceQuestion extends AbstractQuestion {
    private int answer;
    private ArrayList<String> choices;
    private int input;

    public MultipleChoiceQuestion(String question, int answer, ArrayList<String> choices){
        super(question);
        this.answer = answer;
        this.choices = choices;
    }

    public void setInput(int input) {
        this.input = input;
    }

    @Override
    public boolean checkAnswer() {
        return input == answer;
    }
}
