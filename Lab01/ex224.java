// imports Scanner
import java.util.Scanner;

/*
 * LAB 01 - Exercise 2.24
 * Student Name: Patricia Nellas
 * Student ID: 21503005
 * Date: 27/07/2017
 * Version: 0.1
 * Tutor: Kevin Shedlock
 */

public class ex224 {
	/////// Prompts the user to enter five integers and 
	/////// prints the largest and smallest number between them
	public static void main(String[] args) {
		// declares variables
		int number1;
		int number2;
		int number3;
		int number4;
		int number5;

		// Makes instance for scanner
		Scanner input = new Scanner(System.in);
		
		// Prompts user for number inputs
		System.out.println("Enter first number:");
		number1 = input.nextInt();
		System.out.println("Enter second number:");
		number2 = input.nextInt();
		System.out.println("Enter third number:");
		number3 = input.nextInt();
		System.out.println("Enter fourth number:");
		number4 = input.nextInt();
		System.out.println("Enter fifth number:");
		number5 = input.nextInt();
		
		// Makes input into an array
		int[] nums = {number1, number2, number3, number4, number5};
		
		// Determines largest number
		int max = nums[0];
	      for (int i = 1; i < nums.length; i++) {
	         if (nums[i] > max) {
	        	 max = nums[i];
	         }
	      }
	      
	    // Displays the largest number
	    System.out.println("The largest number is " + max); 
	    
	    // Determines smallest number
	    int min = nums[0];
	      for (int i = 1; i < nums.length; i++) {
	         if (nums[i] < min) {
	        	 min = nums[i];
	         }
	      }
	      
	    // Displays the smallest number
	    System.out.println("The smallest number is " + min); 
	    
	    // Closes scanner
	    input.close();
	} // End Main
} // End Class