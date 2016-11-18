package com.String;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver =true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("final score: " + finalScore);
        }

        int thescore = 10_000;
        int thelevelCompleted = 8;
        int thebonus = 200;
        if(gameOver) {
            int finalScore = thescore + (thelevelCompleted * thebonus);
            System.out.println("final score: " + finalScore);
        }
// to redefine the same variable leave out the type
         score = 10_000;
         levelCompleted = 8;
         bonus = 200;

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("final score: " + finalScore);
        }

    }
}
