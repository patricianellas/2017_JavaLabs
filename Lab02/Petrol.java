
public class Petrol {
	// petrol test application to display petrol information including the net purchase amount after discount is applied
	public static void main(String[] args) {
		
		// one object of PetrolPurchase is created
		PetrolPurchase purchase1 = new PetrolPurchase();
		// constructor is used to set values to variables fo the PetrolPurchase object
		purchase1.petrolPurchase("Timaru", "GH1", 12, 2.92, 5.00);
		
		// Displays the PetrolPurchase object's information including the net purchase amount
		System.out.printf("Net Purchase Amount for %s's %s petrol: $%.2f", purchase1.getLocation(), purchase1.getTypePetrol(), purchase1.getPurchaseAmount());
	}
} // end class Petrol
