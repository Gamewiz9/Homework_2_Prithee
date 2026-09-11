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

    void finalResult(int correctCount, int wrongCount){
        if (correctCount > 3){
            System.out.println("Great job!");
        } else{
            System.out.println("Not quite right, try again!");
        }
    }
}
