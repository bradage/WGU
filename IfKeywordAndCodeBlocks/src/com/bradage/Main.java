package com.bradage;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int gameScore = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameScore == 5000) {
            System.out.println("Your score was 5000");
        }

        if(gameScore == 5000)
            System.out.println("Score was 5000 and not in squirley brackets");
        System.out.println("and because we don't use squirley, it doesn't make it to this line, unless if is false");

//        if(gameScore < 5000){
//            System.out.println("your score was less than 5000");
//        }else if(gameScore == 5000){
//            System.out.println("your score was 5000");
//        } else{
//            System.out.println("your score was greater than 5000");
//        }
        if(gameOver == true){
            int finalScore = gameScore + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }


        System.out.println("Challenge Time");

        if(gameOver){
            gameScore = 10000;
            levelCompleted = 8;
            bonus = 200;
            int finalScore = gameScore + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }


    }
}
