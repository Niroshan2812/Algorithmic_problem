import java.util.Random;
import java.util.Scanner;

/*
 * proublme 
 * The problem involves writing a Java program to simulate a simple dice game called "Pig". In this game, two players take turns rolling a six-sided die. 
 * Each player's turn consists of one or more rolls of the die. After each roll, the player has the option to either "hold" and end their turn or to continue rolling the die. 
 * The goal of the game is to be the first player to reach a total score of 100 or more.

Here are the rules of the game in more detail:

At the beginning of each turn, the player rolls the die. If the roll is a 1, the turn ends and the player scores no points for that turn. 
If the roll is a number other than 1, the player adds that number to their turn score and may choose to either continue rolling or hold.
If the player chooses to hold, their turn ends and their turn score is added to their total score. If the player chooses to continue rolling, 
they may roll again and add the new roll to their turn score. They can continue rolling as many times as they like, but if they ever roll a 1,
 their turn ends and their turn score is forfeited.
The game continues with each player taking turns until one player reaches a total score of 100 or more. At that point, 
the game ends and the player with the highest score is the winner.
Your task is to write a Java program that simulates this game. The program should include a function to simulate one turn of the game for a given player, 
a function to simulate an entire game, and any additional helper functions you may need. The program should output the final scores for both players and 
indicate which player won the game.
 */


public class prm7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int player1Score = 0, player2Score = 0;
        int currentPlayer = 1;
        boolean gameOver = false;
        
        System.out.println("Welcome to Pig game!");
        System.out.println("The goal is to be the first player to reach a total score of 100 or more.");
        System.out.println("Press enter to start the game...");
        input.nextLine();
        
        while (!gameOver) {
            int turnScore = 0;
            int roll = rand.nextInt(6) + 1;
            System.out.println("Player " + currentPlayer + ", your first roll is " + roll);
            if (roll == 1) {
                System.out.println("Sorry, you rolled a 1 and score no points this turn.");
            } else {
                turnScore += roll;
                System.out.println("Your current turn score is " + turnScore);
                boolean keepRolling = true;
                while (keepRolling) {
                    System.out.print("Do you want to roll again? (Y/N) ");
                    String answer = input.nextLine();
                    if (answer.equalsIgnoreCase("y")) {
                        roll = rand.nextInt(6) + 1;
                        System.out.println("Your next roll is " + roll);
                        if (roll == 1) {
                            System.out.println("Sorry, you rolled a 1 and score no points this turn.");
                            keepRolling = false;
                        } else {
                            turnScore += roll;
                            System.out.println("Your current turn score is " + turnScore);
                        }
                    } else {
                        keepRolling = false;
                    }
                }
            }
            
            if (currentPlayer == 1) {
                player1Score += turnScore;
                System.out.println("Player 1's total score is now " + player1Score);
                if (player1Score >= 100) {
                    gameOver = true;
                    System.out.println("Player 1 wins!");
                } else {
                    currentPlayer = 2;
                }
            } else {
                player2Score += turnScore;
                System.out.println("Player 2's total score is now " + player2Score);
                if (player2Score >= 100) {
                    gameOver = true;
                    System.out.println("Player 2 wins!");
                } else {
                    currentPlayer = 1;
                }
            }
        }
    }


}
