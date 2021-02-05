package by.academy.deal;

public class Product {

	String name;
	double price;
	int quantity;
	String manufacturer;
	
	public Product () {
	}
	
	public Product (String name, double price, int quantity, String manufacturer) {
		this.name = name;
		this.price = price;
		this.manufacturer = manufacturer;
		this.quantity = quantity;
	}
	
	double getFinalPrice (double sale) {
		price = price * (100-sale)/100;
		return price;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + ", manufacturer="
				+ manufacturer + "]";
	}

	int getQuantityAfterPurchase (int amountOfProduct) {
		quantity = quantity - amountOfProduct;
		return quantity;
	}
	
}