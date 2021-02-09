package by.academy.deal;

public class Product {

	protected String name;
	protected double price;
	protected int quantity;
	protected String countryOfManufacture;
	protected double discount;

	public Product() {
	}

	public Product(String name, double price, int quantity, String countryOfManufacture) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.countryOfManufacture = countryOfManufacture;
	}
	
	protected double getDiscount() {
		if (quantity >= 20) {
			return 0.85;
		} 
		return 1.0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getCountryOfManufacture() {
		return countryOfManufacture;
	}

	public void setCountryOfManufacture(String countryOfManufacture) {
		this.countryOfManufacture = countryOfManufacture;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
}