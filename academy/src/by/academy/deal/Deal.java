package by.academy.deal;

import java.time.LocalDate;
import java.util.Scanner;

import by.academy.deal.Products.Product;

public class Deal implements DealInterface {

	public final static int DEFAULT_PRODUCT_SIZE = 2;

	private String date;
	private User seller;
	private User buyer;
	private Product[] products;
	private int productCounter;

	public Deal() {
		super();
	}

	public Deal(User seller, User buyer, Product[] products) {
		this.seller = seller;
		this.buyer = buyer;
		this.products = products;
	}

	@Override
	public double getBill() {
		double bill = 0;
		if (products != null && products[0] != null) {
			for (Product position : products) {
				if (position != null) {
					bill += position.calcFinalPrice();
					System.out.println(position.getName() + "\nКоличество: " + position.getQuantity() + "  " + "Цена: "
							+ position.getPrice() + "  " + "Сумма: " + position.getQuantity() * position.getPrice()
							+ "\nСкидка: " + Math.round((1 - position.discount()) * 100) + " %"
							+ "\nЦена с учетом скидки: " + position.calcFinalPrice());
					System.out.println("------------------------------------------");
				}
			}
		}
		System.out.println("------------------------------------------");
		System.out.println("Общая сумма: " + bill);
		return bill;
	}

	private void expandProductArray() {
		Product[] tempArray = new Product[products.length * 2 + 1];
		System.arraycopy(products, 0, tempArray, 0, products.length);
		products = tempArray;
	}

	@Override
	public void addProduct(Product product) {
		if (products == null) {
			products = new Product[DEFAULT_PRODUCT_SIZE];
		} else {
			if (productCounter + 1 > products.length) {
				expandProductArray();
			}
		}
		products[productCounter++] = product;
	}

	@Override
	public void deleteProduct(int index) {

		if (index > products.length || index < 0) {
			System.out.println("Index of bound");
			return;
		}
		if (productCounter != index) {
			System.arraycopy(products, index + 1, products, index, products.length - index - productCounter);
		}
		products[productCounter] = null;
		productCounter--;
	}

	public void printProducts() {
		for (int i = 0; i < productCounter; i++) {
			System.out.println("Наименование: " + products[i].getName());
			System.out.println("Производитель: " + products[i].getCountryOfManufacture());
			System.out.println("Сумма продукта: " + products[i].calcFinalPrice());
			System.out.println("------------------------------------------");
		}
	}

	public void registerDealDate() {
		System.out.println("Введите дату совершения сделки в следующем формате: dd/MM/yyyy или dd-MM-yyyy");
		Scanner scan = new Scanner(System.in);
		setDate(scan.nextLine());
		while (User.dateValidator.validate(date) == false) {
			System.out.println(
					"Вы ввели дату сделки не корректно.\nВведите в указанном формате: dd/MM/yyyy или dd-MM-yyyy");
			date = scan.nextLine();
		}
		setDate(date);

	}

	protected void printDeadlineDate() {
		LocalDate today = LocalDate.now();
		LocalDate deadlineDate = today.plusDays(10);
		System.out.println("Дата совершения сделки: " + today);
		System.out.println("Дедлайн сделки: " + deadlineDate);
	}
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public User getSeller() {
		return seller;
	}

	public void setSeller(User seller) {
		this.seller = seller;
	}

	public User getBuyer() {
		return buyer;
	}

	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public int getProductCounter() {
		return productCounter;
	}

	public void setProductCounter(int productCounter) {
		this.productCounter = productCounter;
	}
}
