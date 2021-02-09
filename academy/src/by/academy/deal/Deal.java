package by.academy.deal;

import java.util.ArrayList;

public class Deal {
	protected Person seller;
	protected Person buyer;
	protected ArrayList<Product> listOfProducts = new ArrayList<Product>();
	protected String dealDate;

	public double getBill() {
		double finalPrice = 0;
		double bill = 0;
		for (Product position : listOfProducts) {
			finalPrice = position.getPrice() * position.getDiscount() * position.getQuantity();
			bill += finalPrice;
			System.out.println(position.getName() + "\nКоличество: " + position.getQuantity() + "  " + "Цена: "
					+ position.getPrice() + "  " + "Сумма: " + position.getQuantity() * position.getPrice()
					+ "\nСкидка: " + Math.round((1 - position.getDiscount()) * 100) + " %" + "\nЦена с учетом скидки: "
					+ finalPrice);
			System.out.println("------------------------------------------");
		}
		System.out.println("------------------------------------------");
		System.out.println("Общая сумма: " + bill);
		return bill;
	}

	public void addProduct(Product product) {
		listOfProducts.add(product);
	}

}
