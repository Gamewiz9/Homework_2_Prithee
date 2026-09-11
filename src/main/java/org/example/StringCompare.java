package org.example;

public class StringCompare {

    boolean outputCompare ;

    boolean compare(String userInput, String nextWord){
        if (userInput.equals(nextWord)){
            outputCompare = true;
        } else {
            outputCompare  = false;
        }
        return outputCompare ;
    }

    String finalResult(int correctCount, int wrongCount){

        String userSendOff;

        if (correctCount >= 3){
            userSendOff = ("Great job!");
        } else{
            userSendOff = ("Not quite right, try again!");
        }

        return userSendOff;
    }
}
