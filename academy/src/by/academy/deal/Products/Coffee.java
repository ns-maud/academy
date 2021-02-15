package by.academy.deal.Products;

public class Coffee extends Product {

	private String caffeine;
	
	public Coffee() {
	}
	
	public Coffee(String name, double price, int quantity, String countryOfManufacture, String caffeine) {
		super(name, price, quantity, countryOfManufacture);
		this.caffeine = caffeine;
	}
	
	@Override
	public double discount () {
		if (quantity>=3) {
			return 0.85;
		}
		return 1.0;
	}

	public String getCaffeine() {
		return caffeine;
	}

	public void setCaffeine(String caffeine) {
		this.caffeine = caffeine;
	}
}
