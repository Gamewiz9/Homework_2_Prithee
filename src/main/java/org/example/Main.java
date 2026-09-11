package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        int correctCount = 0;

        int wrongCount = 0;

        String words = "Shall I compare thee to a summer’s day? " +
                "Thou art more lovely and more temperate: " +
                "Rough winds do shake the darling buds of May, " +
                "And summer’s lease hath all too short a date; " +
                "Sometime too hot the eye of heaven shines, " +
                "And often is his gold complexion dimm’d; " +
                "And every fair from fair sometime declines, " +
                "By chance or nature’s changing course untrimm'd; " +
                "But thy eternal summer shall not fade, " +
                "Nor lose possession of that fair thou ow’st; " +
                "Nor shall death brag thou wander’st in his shade, " +
                "When in eternal lines to time thou grow’st: " +
                "So long as men can breathe or eyes can see, " +
                "So long lives this, and this gives life to thee. ";

        String [] wordOrder = words.split(" ");

        int max =  (wordOrder.length) - 1;

        int num;

        Scanner scanner = new Scanner(System.in);

        while ((correctCount < 3) && (wrongCount <  3)){

            num = (int)(Math.random() * max);

            StringBuilder sb = new StringBuilder();

            int count = 0;

            for(int i = 0; i < num; i++){

                if (count == 6){
                    sb.append("\n");
                    sb.append(" ");
                    count = 0;
                }

                sb.append(wordOrder[i]);
                sb.append(" ");
                count++;
            }

            sb.append("______");

            String text = sb.toString();

            System.out.println(text);

            System.out.println(wordOrder[num]);

            System.out.println("What is the next word in the sonnet?\n");

            String userInput = scanner.next();

            userInput = userInput.toLowerCase();

            String correctAns = wordOrder[num].toLowerCase();

            if (userInput.equals(correctAns)){
                correctCount++;
            } else {
                wrongCount++;
            }
        }

        if (correctCount == 3){
            System.out.println("Great job!");
        } else{
            System.out.println("Not quite right, try again!");
        }
    }
}
