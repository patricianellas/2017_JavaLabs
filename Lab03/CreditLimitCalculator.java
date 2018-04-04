// imports scanner
import java.util.Scanner;

/*
 * LAB 03 - Task 4.18 - CREDIT LIMIT CALCULATOR
 * Student Name: Patricia Nellas
 * Student ID: 21503005
 * Date: 26/08/2017
 * Version: 0.1
 * Tutor: Kevin Shedlock
 */

public class CreditLimitCalculator {

	public static void main(String[] args) {
		//declare variables
		int accountNum;
		int initialBal;
		int itemTotal;
		int creditTotal;
		int creditLimit;
		int charges;
		int balance;
		
		// create instance of scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Account Number: "); // prompts for account number
		accountNum = input.nextInt(); // assigns value of input to accountNum
		System.out.print("Enter Balance at the beginning of the month: "); // prompts for balance at the beginning of month
		initialBal = input.nextInt(); // assigns value of input to initialBal
		System.out.print("Enter total of all items charged by the customer this month: "); // prompts for total of items charged
		itemTotal = input.nextInt(); // assigns value of input to itemTotal
		System.out.print("Enter total of all credits applied to the customer's account this month: "); // prompts for credit total
		creditTotal = input.nextInt(); // assigns value of input to creditTotal
		System.out.print("Enter allowed credit limit: "); // prompts for credit limit
		creditLimit = input.nextInt(); // assigns value of input to creditLimit
		
		charges = initialBal + itemTotal + creditTotal; // calculates total charges
		balance = creditLimit - charges; // calculates the balance
		
		// prints message if the user has exceeded credit limit otherwise prints out the remaining balance
		if (balance < 0) {
			System.out.printf("%nUser with Account Number %d has exceeded credit limit.", accountNum);
		} else {
			System.out.printf("User with Account Number %d has $%d balance", accountNum, balance);
		}
		
		// closes scanner
		input.close();

	}

}
