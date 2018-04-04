
public class PetrolPurchase {
	// Declare variables 
	private String location;
	private String typePetrol;
	private int quantity;
	private double priceLitre;
	private double percentDiscount;
	
	// Constructor for a petrol purchase
	public void petrolPurchase(String location, String typePetrol, int quantity, double priceLitre, double percentDiscount) {
		this.location = location;
		this.typePetrol = typePetrol;
		this.quantity = quantity;
		this.priceLitre = priceLitre;
		this.percentDiscount = percentDiscount;
	}
	
	// method to set location
	public void setLocation(String location) {
		this.location = location;
	}
	
	// method to get location
	public String getLocation() {
		return location;
	}
	
	// method to set petrol type
	public void setTypePetrol(String typePetrol) {
		this.typePetrol = typePetrol;
	}
	
	// method to get petrol type
	public String getTypePetrol() {
		return typePetrol;
	}
	
	// method to set quantity amount
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	// method to get quantity amount
	public int getQuantity() {
		return quantity;
	}
	
	// method to set litre price of petrol
	public void setPriceLitre(double priceLitre) {
		this.priceLitre = priceLitre;
	}
	
	// method to get litre price of petrol
	public double getPriceLitre() {
		return priceLitre;
	}
	
	// method to set discount
	public void setPercentDiscount(double percentDiscount) {
		this.percentDiscount = percentDiscount;
	}
	
	// method to get discount
	public double getPercentDiscount() {
		return percentDiscount;
	}
	
	// method to calculate and retriever net purchase amount after discount is applied
	public double getPurchaseAmount() {
		double discountAmount = (quantity * priceLitre) * (percentDiscount/100);
		double netpurchaseAmount = (quantity * priceLitre) - discountAmount;
		return netpurchaseAmount;
	}
}
