package by.academy.deal.Products;

public class Wine extends Product {
	
	protected String colour;
	
	public Wine () {
	}
	
	public Wine (String name, double price, int quantity, String countryOfManufacture, String colour) {
		super(name, price, quantity, countryOfManufacture);
		this.colour = colour;
	}
	
	@Override
	public double discount () {
		if (colour.equals("Rose")) {
			return 0.85;
		}
		return 1.0;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
}
