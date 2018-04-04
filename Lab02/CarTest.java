// imports scanner for user input
import java.util.Scanner;

public class CarTest {
	// Test application to display the cars' capabilities
	public static void main(String[] args) {
		
		// Creates two new objects of cars using constructor
		Car car1 = new Car("Honda Swift", "2004", 8599.00);
		Car car2 = new Car("Toyota Prius", "2014", 29399.99);

		// Displays the cars and their prices (gross amount)
		System.out.printf("Gross price for %s %s is $%.2f%n", car1.getModel(), car1.getYear(), car1.getPrice());
		System.out.printf("Gross price for %s %s is $%.2f%n%n", car2.getModel(), car2.getYear(), car2.getPrice());
		
		// Creates instance of scanner for user input
		Scanner input = new Scanner(System.in);
		
		// Prompts user for price discounts for each car
		System.out.printf("Enter percentage discount for %s %s: %% ", car1.getModel(), car1.getYear());
		car1.applyDiscount(input.nextDouble());
		System.out.printf("Enter percentage discount for %s %s: %% ", car2.getModel(), car2.getYear());
		car2.applyDiscount(input.nextDouble());
		
		// Displays the net price for cars after discount is applied
		
		System.out.printf("%nNet price for %s %s: $%.2f%n", car1.getModel(), car1.getYear(), car1.getNetPrice());
		System.out.printf("Net price for %s %s: $%.2f%n", car2.getModel(), car2.getYear(), car2.getNetPrice());
		
		// Closes scanner
		input.close();
	}

}
