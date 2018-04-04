import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// create a Scanner object to obtain input from the command window
		Scanner input = new Scanner(System.in);
		
		// create an Account object and assign it to myAccount
		Account myAccount = new Account();
		
		// display initial value of name (null)
		System.out.printf("Initial name is: %s%n%n", myAccount.getName());
		
		// prompt for and read name
		System.out.println("Please enter the name: ");
		String theName = input.nextLine(); // read a line of text
		System.out.println("Please enter balance: ");
		double theBalance = input.nextDouble(); // read input
		myAccount.setAccount(theName, theBalance); // put theName in myAccount
		System.out.println(); // outputs a blank line
		
		// display the name stored in object myAccount
		System.out.printf("Name in object your Account is: %n%s%n", myAccount.getName());
		System.out.printf("Balance on your Account is: $%.2f", myAccount.getBalance());
		
		System.out.println(); // outputs a blank line
		
		// prompt for withdrawal amount
		System.out.println("Please enter amount to withdraw: ");
		double withdraw = input.nextDouble();
		myAccount.withdrawMoney(withdraw); // withdraws money
		
		System.out.println(); // outputs a blank line
		
		// prints out withdrawal message (successful or not)
		System.out.println(myAccount.getMsg());
		// prints the balance again
		System.out.printf("Balance on your Account is: $%.2f", myAccount.getBalance());
		
		// closes scanner
		input.close();
	}

		
} // end class AccountTest
