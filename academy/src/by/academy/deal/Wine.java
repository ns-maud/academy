package by.academy.deal;

public class Wine extends Product {
	
	protected String colour;
	
	public Wine (String name, double price, int quantity, String countryOfManufacture, String colour) {
		super(name, price, quantity, countryOfManufacture);
		this.colour = colour;
	}
	
	@Override
	protected double getDiscount () {
		if (countryOfManufacture.equalsIgnoreCase("France")) {
			return 0.95;
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
