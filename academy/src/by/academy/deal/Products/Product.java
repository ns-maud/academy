package by.academy.deal.Products;

public abstract class Product {

	protected String name;
	protected double price;
	protected int quantity;
	protected String countryOfManufacture;

	public Product() {
		super();
	}

	public Product(String name, double price, int quantity, String countryOfManufacture) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.countryOfManufacture = countryOfManufacture;
	}

	public double calcFinalPrice() {
		return quantity * price * discount();
	}

	public abstract double discount();

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
}
