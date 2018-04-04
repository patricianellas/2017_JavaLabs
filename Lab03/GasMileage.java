// imports scanner
import java.util.Scanner;

/*
 * LAB 03 - Task 4.17 - GAS MILEAGE
 * Student Name: Patricia Nellas
 * Student ID: 21503005
 * Date: 26/08/2017
 * Version: 0.1
 * Tutor: Kevin Shedlock
 */

public class GasMileage {

	public static void main(String[] args) {
		// creates instance of scanner
		Scanner input = new Scanner(System.in);
		
		// declare variables
		double milesperGallon = 0;
		int counter = 0;
		int totalmiles = 0;
		int totalgallons = 0;
		int gallons = 0;
		
		// STARTING PROMPT
		System.out.printf("Enter miles or -1 to quit: "); // prompts user for input miles or -1 to exit
		int miles = input.nextInt(); // assigns input value to miles variable

        
		// loop until sentinel value read from user
	     while (miles != -1)
	     {
	    	 counter = counter + 1; // increments counter
	    	 System.out.print("Enter gallons: "); // prompts user for gallon input
	         gallons = input.nextInt(); // assigns input value to gallons variable
	    	 totalmiles += miles; // adds miles to total miles
	    	 totalgallons += gallons; // adds gallons to total gallons
	    	 milesperGallon = (double) miles / gallons; // calculates miles per gallons
	    	 System.out.printf("Miles per gallon: %.2fmpg %n", milesperGallon); // prints out miles per gallon (singular)
	    	 System.out.printf("Enter miles or -1 to quit: "); // prompts user for input miles or -1 to exit LOOP
		 	 miles = input.nextInt(); // assigns input value to miles variable
		 	 
	     }
	     
	     // if counter is not equal to zero / if loop is run even once
	     if (counter != 0)
	     {
	        // use number with decimal point to calculate total miles per gallon for all the input
	        double totalmilespergallon = (double) totalmiles / totalgallons;                

	        // display total and average (with two digits of precision)
	        System.out.printf("%nTotal of the miles entered is %d%n", totalmiles);
	        System.out.printf("Total miles per gallon: %.2fmpg%n", totalmilespergallon);
	     }
	     else 
	    	// no input was entered, so output appropriate message
	        System.out.println("No input was entered"); 
		

	     // closes scanner
	     input.close();
	}

}
