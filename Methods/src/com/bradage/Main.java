package com.bradage;

public class Main {

    public static void main(String[] args) {
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

//        String names ="james";
//        System.out.println(names);
//
//        displayHighScorePosition("James", 56);
//
//
//        int highScore = calculateScore(true, 800, 5, 100);
//        System.out.println("Your final score was "+ highScore);
//
//
//        highScore = calculateScore(true, 10000, 8, 200);
//        System.out.println("Your final score was "+ highScore);
//    }
//
//    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
//        if(gameOver){
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 1000;
////            System.out.println("Your final score was " + finalScore);
//            return finalScore;
//        }
//         return -1;
//    }


        //Challenge
        int highSchorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Bradey", highSchorePosition);

        highSchorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Mason", highSchorePosition);

        highSchorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Korbyn", highSchorePosition);

        highSchorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Lacey", highSchorePosition);
    }
        public static void displayHighScorePosition(String playerName,int positionHighScore){
            System.out.println(playerName + " managed to get into position " + positionHighScore + " on the high score table");

        }

        public static int calculateHighScorePosition(int playerScore){

            if (playerScore > 1000) {
                return 1;
            } else if (playerScore > 500 && playerScore <= 1000) {
                return 2;
            } else if (playerScore > 100 && playerScore <= 500); {
                return 3;
            } else
                return 4;
        }
    }
