package by.academy.deal;

import by.academy.deal.Products.Product;

public interface DealInterface {

	double getBill();

	void addProduct(Product product);

	void deleteProduct(String name);
	
	void printProducts();
	
}
