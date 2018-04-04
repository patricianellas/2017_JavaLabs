// imports Scanner
import java.util.Scanner;

/*
 * LAB 01 - Exercise 2.25
 * Student Name: Patricia Nellas
 * Student ID: 21503005
 * Date: 27/07/2017
 * Version: 0.1
 * Tutor: Kevin Shedlock
 */

public class ex225 {
	/////// Prompts the user to enter an integer and 
	/////// determines whether or not the number is divisible by 3.
	public static void main(String[] args) {
		
		// Declares number variable
		int number1;
		
		// Creates instance of Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompts user for number input
		System.out.println("Enter number:");
		number1 = input.nextInt();
		
		// Determines whether or not the input is divisible by 3
		if (number1 %3 == 0) {
			System.out.println(number1 + " is divisible by 3.");
		} else {
			System.out.println(number1 + " is not divisible by 3.");
		}
		
		// Closes scanner
		input.close();
	} // End Main

} // End Class
