
public class Car {
	// declares variables
	private String model;
	private String year;
	private double price;
	private double netprice;
	
	// car constructor
	public Car(String model, String year, double price) {
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	// sets car model
	public void setModel(String model) {
		this.model = model;
	}
	
	// gets car model
	public String getModel() {
		return model;
	}
	
	// sets car year
	public void setYear(String year) {
		this.year = year;
	}
	
	// gets car year
	public String getYear() {
		return year;
	}
	
	// sets car price
	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		}
	}
	
	// gets car price
	public double getPrice() {
		return price;
	}
	
	// method to apply discount to car price
	public void applyDiscount(double discount) {
		discount = price * (discount/100);
		this.netprice = price - discount;
	}
	
	// gets price after discount is applied
	public double getNetPrice() {
		return netprice;
	}
}
