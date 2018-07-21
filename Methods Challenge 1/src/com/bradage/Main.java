package com.bradage;

public class Main {

    public static void main(String[] args) {
        int highSchorePosition = calculateHighScorePosition(1500);
    }
        public static void displayHighScorePosition(String playerName,int positionHighScore){
            System.out.println(playerName + " managed to get into position " + positionHighScore + " on the high score table");

        }

        public static int calculateHighScorePosition(int playerScore){
            if (playerScore > 1000) {
                return 1;
            } else if (playerScore >= 500 && playerScore >= 1000) {
                return 2;
            } else if (playerScore > 100 && playerScore < 500) {
                return 3;
            } else
                return 4;
        }
    }
