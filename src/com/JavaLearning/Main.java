package com.JavaLearning;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 50;

        if(score == 5000){
            System.out.println("Your score was = " + score);

            if(gameOver){
                int finalScore = score + (levelCompleted * bonus);
                finalScore +=  1000;
                System.out.println("Your final score was = " + finalScore);
            }

            score= 10000;
            levelCompleted = 8;
            bonus = 100;
            if(gameOver){
                int finalScore = score + (levelCompleted * bonus);
                finalScore +=  1000;
                System.out.println("Your final score was = " + finalScore);
            }
        }
    }
}
