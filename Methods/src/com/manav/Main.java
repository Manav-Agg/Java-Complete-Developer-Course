package com.manav;

public class Main {

    public static void main(String[] args) {
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

//        calculateScore(true, 800, levelCompleted, bonus);
        int highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        System.out.println("---------------------------------------------------");

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Manav", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Harry", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Vashu", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Yogi", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Pallavi", highScorePosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver == true){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position " +
                highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000)
            return 1;
        else if (playerScore >= 500 && playerScore < 1000)
            return 2;
        else if (playerScore >= 100 && playerScore < 500)
            return 3;
        else
            return 4;
    }
}