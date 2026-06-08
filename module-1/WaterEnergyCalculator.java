import java.util.Scanner;

/*
Name: Kobe Alexander
Date: 6/7/2026
Assignment: Module 1.3 Assignment

The purpose of this code is to take the amount of water from the user and then calculate the amount of energy needed to make the energy go from one temp to the next which is also inputted by user
*/

public class WaterEnergyCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the amount of water in kilograms
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        // Prompt the user for the initial temperature
        System.out.print("Enter the initial temperature in Celsius: ");
        double initialTemperature = input.nextDouble();

        // Prompt the user for the final temperature
        System.out.print("Enter the final temperature in Celsius: ");
        double finalTemperature = input.nextDouble();

        // Calculate the energy needed
        double energy = waterMass * (finalTemperature - initialTemperature) * 4184;

        // Display the result
        System.out.println("The energy needed is " + energy + " Joules.");

        input.close();
    }
}