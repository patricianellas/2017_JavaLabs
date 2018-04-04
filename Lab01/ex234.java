// Imports scanner
import java.util.Scanner;

/*
 * LAB 01 - Exercise 2.34
 * Student Name: Patricia Nellas
 * Student ID: 21503005
 * Date: 27/07/2017
 * Version: 0.1
 * Tutor: Kevin Shedlock
 */

public class ex234 {
	/////// Prompts the user to enter the world population count and growth rate 
	/////// then prints the estimated population growth within 5 years.
	public static void main(String[] args) {
		
		// Declares variables
		double worldPopulation;
		double growthRate;
		double year1;
		double year2;
		double year3;
		double year4;
		double year5;

		// Creates instance of Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompts user for input 
		System.out.println("Enter current world population:");
		worldPopulation = input.nextDouble(); // INPUT
		System.out.println("Enter growth rate (%):");
		growthRate = input.nextDouble(); // INPUT
		growthRate = growthRate/100;
		
		// Calculates the population growth
		year1 = worldPopulation + (worldPopulation * growthRate); // First year
		year2 = year1 + (year1 * growthRate); // Second year
		year3 = year2 + (year2 * growthRate); // Third year
		year4 = year3 + (year3 * growthRate); // Fourth year
		year5 = year4 + (year4 * growthRate); // Fifth year
	
		// Displays the estimated world population growth in 5 years
		System.out.println("Estimated world population within 5 years' time:");
		System.out.printf("After 1 year: %.0f", year1);
		System.out.printf("\nAfter 2 years: %.0f", year2);
		System.out.printf("\nAfter 3 years: %.0f", year3);
		System.out.printf("\nAfter 4 years: %.0f", year4);
		System.out.printf("\nAfter 5 years: %.0f", year5);
		
		// Closes the scanner
		input.close();
		
	}// End Main

}// End Class
