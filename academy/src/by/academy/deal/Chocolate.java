package by.academy.deal;

public class Chocolate extends Product {

	public Chocolate(String name, double price, int quantity, String countryOfManufacture) {
		super(name, price, quantity, countryOfManufacture);
	}

	@Override
	protected double getDiscount() {
		if (name.equalsIgnoreCase("Ritter Sport")) {
			return 0.9;
		}
		return 1.0;
	}
}
