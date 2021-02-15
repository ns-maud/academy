package by.academy.deal.Products;

public class Chocolate extends Product {
	
	private String type;
	
	public Chocolate () {
	}

	public Chocolate(String name, double price, int quantity, String countryOfManufacture, String type) {
		super(name, price, quantity, countryOfManufacture);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public double discount () {
		if (type.equals("Milk")) {
			return 0.9;
		}
		return 1.0;
	}
}
