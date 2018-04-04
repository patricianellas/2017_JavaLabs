
public class Account {
	private String name; // instance variable
	private double balance;
	private String message = "";
	
	// method to set the name in the object
	public void setAccount(String name, double balance) {
		this.name = name; // store the name
		this.balance = balance;
	}
	
	// method to retrieve the name from the object
	public String getName() {
		return name; // return value of name to caller
	}
	
	// returns the balance
	public double getBalance() {
		return balance;
	}
	
	// method to withdraw money from the balance
	public void withdrawMoney(double money) {
		if (balance >= money) {
			this.balance = balance - money;
			this.message = "Withdraw successful!";
		} else {
			this.message = "Withdrawal amount exceeded account balance.";
		}
	}
	
	// returns the withdrawal message
	public String getMsg() {
		return message;
	}
} // end class Account
