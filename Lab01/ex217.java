// import scanner
import java.util.Scanner;

/*
 * LAB 01 - Exercise 2.17
 * Student Name: Patricia Nellas
 * Student ID: 21503005
 * Date: 27/07/2017
 * Version: 0.1
 * Tutor: Kevin Shedlock
 */

public class ex217 {
	/////// Prompts the user to enter three integers and 
	/////// prints their sum, average, and product including the smallest and largest number.
	public static void main(String[] args) {
		
		// Declaring variables
		int number1;
		int number2;
		int number3;
		int sum;
		int average;
		int product;
		
		//Make instance of Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompts input from user for three numbers
		System.out.println("Enter first number:");
		number1 = input.nextInt();
		System.out.println("Enter second number:");
		number2 = input.nextInt();
		System.out.println("Enter third number:");
		number3 = input.nextInt();
		
		// Calculates Sum, Average, and Product and Displays them 
		sum = number1 + number2 + number3;
		System.out.printf("The sum of the numbers is %d\n", sum);
		average = sum / 3;
		System.out.printf("The average of the numbers is %d\n", average);
		product = number1 * number2 * number3;
		System.out.printf("The product of the numbers is %d\n", product);
		
		// Determines which number is the largest and displays it
		if (number1 >= number2 && number1 >= number3) {
			System.out.println(number1 + " is the largest number.");
		} else if (number2 >= number1 && number2 >= number3) {
			System.out.println(number2 + " is the largest number.");
		} else if (number3 >= number1 && number3 >= number2) {
			System.out.println(number3 + " is the largest number.");
		}
		// Determines which number is the smallest and displays it
		if (number1 <= number2 && number1 <= number3) {
			System.out.println(number1 + " is the smallest number.");
		} else if (number2 <= number1 && number2 <= number3) {
			System.out.println(number2 + " is the smallest number.");
		} else if (number3 <= number1 && number3 <= number2) {
			System.out.println(number3 + " is the smallest number.");
		}
		
		// Scanner is closed
		input.close();
	} // End Main
} // End Class 