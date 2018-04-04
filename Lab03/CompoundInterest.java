
/*
 * LAB 03 - Task 5.18 - MODIFIED COMPOUND INTEREST PROGRAM
 * Student Name: Patricia Nellas
 * Student ID: 21503005
 * Date: 26/08/2017
 * Version: 0.1
 * Tutor: Kevin Shedlock
 */

public class CompoundInterest {
	// CALCULATES THE COMPOUND INTEREST WITH INTEGER-TYPE MONETARY VALUES
	// AND THEREBY DISPLAYING THE AMOUNT IN THE FORMAT OF DOLLAR . CENTS
	public static void main(String[] args) {
		int amount; // amount on deposit at end of each year (dollars)
		int cents;  // amount on deposit at end of each year (cents)
		double dAmount; // variable for compound interest calculation
		int principal = 100000; // initial amount before interest
		double rate = 0.05; // interest rate
		
		// display headers
		System.out.printf("%s%20s\n", "Year", "Amount on deposit");
		
		// calculate amount on deposit for each of ten years
		for (int year = 1; year <= 10; year++) {
			// calculate new amount for specified year
			
			dAmount = (principal/100) * Math.pow(1 + rate, year); // calculate the compound interest
			amount = (int)Math.round((int)dAmount); // calculate the dollars
			cents = (int)(dAmount * 100) % 100; // calculate the cents
			
			// display the year and the amount
			System.out.printf("%4d%,20d.%d\n", year, amount, cents);
			
		} // end for

	} // end main

} // end class CompoundInterest
