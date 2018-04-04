// imports Scanner
import java.util.Scanner;

/*
 * LAB 01 - Exercise 2.15
 * Student Name: Patricia Nellas
 * Student ID: 21503005
 * Date: 27/07/2017
 * Version: 0.1
 * Tutor: Kevin Shedlock
 */

public class ex215 {
	/////// Prompts the user to enter two integers and 
	/////// prints their sum, product, difference and division.
	public static void main(String[] args) {
		
		// Declaring the variables
		int number1;
		int number2;
		int sum;
		int product;
		int difference;
		int quotient;
		
		// Making an instance of the Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompts input from the user for number1
		System.out.println("Enter first number:");
		number1 = input.nextInt();
		
		// Prompts input from the user for number2
		System.out.println("Enter second number:");
		number2 = input.nextInt();
		
		// Does the arithmetic for the two numbers
		sum = number1 + number2;
		product = number1 * number2;
		difference = number1 - number2;
		quotient = number1 / number2;
		
		// Prints out the sum, product, difference, and quotient
		System.out.printf("The sum of the two numbers is %d\n", sum);
		System.out.printf("The product of the two numbers is %d\n", product);
		System.out.printf("The difference of the two numbers is %d\n", difference);
		System.out.printf("The quotient of the two numbers is %d\n", quotient);
		
		// Closes scanner
		input.close();
		
	}// End Main
} // End Class
