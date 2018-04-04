// imports Scanner
import java.util.Scanner;

/*
 * LAB 01 - Exercise 2.16
 * Student Name: Patricia Nellas
 * Student ID: 21503005
 * Date: 27/07/2017
 * Version: 0.1
 * Tutor: Kevin Shedlock
 */

public class ex216 {
	/////// Prompts the user to enter two integers and 
	/////// determine which number is the larger or smaller one between the two; or if they're equal
	public static void main(String[] args) {
		
		// Declaring variables
		int number1;
		int number2;
		
		// Makes an instance of Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompts input from the user for number1
		System.out.println("Enter first number:");
		number1 = input.nextInt();
				
		// Prompts input from the user for number2
		System.out.println("Enter second number:");
		number2 = input.nextInt();
		
		// Determines if number1 is larger, smaller, or equal to number2
		if (number1 > number2) {
			System.out.printf(number1 + " is larger.");
		}
		if (number2 > number1) {
			System.out.printf(number2 + " is larger.");
		}
		if (number1 == number2) {
			System.out.println("These numbers are equal.");
		}
		
		// Closes scanner
		input.close();
	} // End Main
} // End Class