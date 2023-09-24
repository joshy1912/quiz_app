package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        String[] questions = {
            "",
            "",
            "",
        };

        String[] answers = {
                "",
                "",
                "",
        };
        int numberOfQuestions = questions.length;

        for (int i = 0; i< numberOfQuestions; i++){
            System.out.println("question " + (i + 1)+ ": " + questions[i]);
            System.out.println("your answer: ");
            String userAnswer = scanner.nextLine();


            if (userAnswer.equalsIgnoreCase(answers[i])){
                System.out.println("Correct!\n");
                score++;
            }else {
                System.out.println("Wrong the correct answer is: " + answers[i] + "\n");
            }
        }
        System.out.println("Quiz completed!");
        System.out.println("Your score:"+ score + "out of " + numberOfQuestions);

        scanner.close();
    }





}
