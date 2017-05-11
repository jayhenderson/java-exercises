package org.launchcode.java.studios.quiz;

/**
 * Created by J on 3/20/2017.
 */
public abstract class AbstractQuestion {
    private String question;

    AbstractQuestion(String question){
        this.question = question;
    }

    public String getQuestion(){
        return this.question;
    }


    public abstract boolean checkAnswer();


}
