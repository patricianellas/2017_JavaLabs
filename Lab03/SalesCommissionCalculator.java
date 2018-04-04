// imports scanner
import java.util.Scanner;

/*
 * LAB 03 - Task 4.19 - SALES COMMISSION CALCULATOR
 * Student Name: Patricia Nellas
 * Student ID: 21503005
 * Date: 26/08/2017
 * Version: 0.1
 * Tutor: Kevin Shedlock
 */

public class SalesCommissionCalculator {

	public static void main(String[] args) {
		// creates instance of scanner
		Scanner input = new Scanner(System.in);
		
		// declare variables
		double item1 = 239.99; // ITEM NUMBER 1
		double item2 = 129.75; // ITEM NUMBER 2
		double item3 = 99.95; // ITEM NUMBER 3
		double item4 = 350.89; // ITEM NUMBER 4
		int counter = 0; // counter
		double price = 0; // price 
		double totalAmount = 0; // total amount 
		double commission = 0; // commission 
		double totalEarnings = 0; // total earnings 
		
		// STARTING PROMPT
		System.out.printf("Enter item number sold or -1 to quit: "); // prompts user for which item no. was sold or type -1 to exit
		int itemNum = input.nextInt(); // assigns value to itemNum variable
		
		// sentinel-controlled LOOP
		// while itemNum is not -1, do loop
		while (itemNum != -1) {
	    	 counter = counter + 1; // increments counter
	    	 // switch to assign item number price to price variable
	    	 switch (itemNum) {
	            case 1:  price = item1;
	                     break;
	            case 2:  price = item2;
	                     break;
	            case 3:  price = item3;
	                     break;
	            case 4:  price = item4;
	                     break;
	    	 }
	    	 
	    	 // adds price to totalAmount
	    	 totalAmount += price; 

	    	 System.out.printf("Enter item number sold or -1 to quit: "); // prompts user for which item no. was sold or type -1 to exit
	 		 itemNum = input.nextInt(); // assigns value to itemNum variable
		 	 
	    }
		
		commission = 0.09 * totalAmount; // calculates 9% commission for salesperson
		totalEarnings = commission + 200.00; // adds $200 (weekly earnings of salesperson) and commission
		
		// prints out information of items sold, total amount, commission for sales, and salesperson's total weekly earnings
		System.out.printf("%nNUMBER OF ITEMS: %d", counter);
		System.out.printf("%nTOTAL AMOUNT: $%.2f", totalAmount);
		System.out.printf("%nCOMMISSION: $%.2f", commission);
		System.out.printf("%nSALESPERSON'S TOTAL WEEKLY EARNINGS: $%.2f", totalEarnings);
		
		// closes scanner
		input.close();

	}

}
