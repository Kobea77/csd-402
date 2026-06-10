import java.util.Scanner;

/*
Name: Kobe Alexander
Date: 6/9/2026
Assignment: Module 2.2 Assignment

The purpose of this code is to play rock paper scissors between a computer and user input
*/

public class rockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //User input

        int computerNum = (int)(Math.random() * 3 + 1);  // 1 to 3

        System.out.println("Rock-Paper-Scissors Game");
        System.out.println("Enter 1 for Rock");
        System.out.println("Enter 2 for Paper");
        System.out.println("Enter 3 for Scissors");
        System.out.print("Your choice: ");
        int userNum = input.nextInt();

        System.out.println("--------------- Results ----------- ");
        if (userNum < 1 || userNum > 3) {
            System.out.println("Invalid choice. Please enter 1, 2, or 3.");
        } else {
            if (userNum == 1) { // User inputs rock
                if (computerNum == 1) { //Computer generates rock = match is a draw
                    System.out.println("Computer Input = Rock");
                    System.out.println("User Input = Rock");
                    System.out.println("Result = Draw!");
                } else if (computerNum == 2) { //Computer generates paper = Computer wins
                    System.out.println("Computer Input = Paper");
                    System.out.println("User Input = Rock");
                    System.out.println("Result = Computer Wins!");
                } else if (computerNum == 3) { //Computer generates Scissors =  User wins
                    System.out.println("Computer Input = Scissors");
                    System.out.println("User Input = Rock");
                    System.out.println("Result = User Wins!");
                }
            } else if (userNum == 2) { //User inputs paper
                if (computerNum == 1) { // Computer generates rock = User wins
                    System.out.println("Computer Input = Rock");
                    System.out.println("User Input = Paper");
                    System.out.println("Result = User Wins!");

                } else if (computerNum == 2) { // Computer generates Paper = Match is a draw
                    System.out.println("Computer Input = Paper");
                    System.out.println("User Input = Paper");
                    System.out.println("Result = Draw!");

                } else if (computerNum == 3) { // Computer generates Scissors = Computer wins
                    System.out.println("Computer Input = Scissors");
                    System.out.println("User Input = Paper");
                    System.out.println("Result = Computer Wins!");
                }
            } else if (userNum == 3) { // User inputs Scissors
                if (computerNum == 1) { // Computer generates rock = Computer wins
                    System.out.println("Computer Input = Rock");
                    System.out.println("User Input = Scissor");
                    System.out.println("Result = Computer Wins!");
                } else if (computerNum == 2) { // Computer generates Paper = User Wins
                    System.out.println("Computer Input = Paper");
                    System.out.println("User Input = Scissor");
                    System.out.println("Result = User Wins!");
                } else if (computerNum == 3) { // Computer generates Scissors = Match draw
                    System.out.println("Computer Input = Scissors");
                    System.out.println("User Input = Scissor");
                    System.out.println("Result = Draw!");
                }
            }

        }
        input.close();
    }
}