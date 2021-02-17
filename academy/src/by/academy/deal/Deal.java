package by.academy.deal;

import java.time.LocalDate;
import java.util.Scanner;

import by.academy.deal.Products.Chocolate;
import by.academy.deal.Products.Coffee;
import by.academy.deal.Products.Product;
import by.academy.deal.Products.Wine;

public class Deal implements DealInterface {

	private final static int DEFAULT_PRODUCT_SIZE = 1;

	private String date;
	private User seller;
	private User buyer;
	private Product[] products;
	private int productCounter = 0;

	public Deal() {
		super();
	}

	public Deal(User seller, User buyer, Product[] products) {
		this.seller = seller;
		this.buyer = buyer;
		this.products = products;
	}

	public void manageDeal(Scanner scan) {
		printMenu();
		String command = scan.next();

		enterCommand: {
			while (!"0".equals(command)) {
				switch (command) {
				case "1":
					System.out.println("Посмотреть список продуктов");
					printProducts();
					break;
				case "2":
					System.out.println("Добавить продукт");
					manageProducts(scan);
					break;
				case "3":
					if (products != null && products[0] != null) {
						System.out.println("Введите наименование продукта для его удаления");
						scan.nextLine();
						String name = scan.nextLine();
						System.out.println(name);
						deleteProduct(name);
					} else {
						System.out.println("Продукт для удаления не выбран");
					}
					break;
				case "4":
					System.out.println("Провести сделку");
					getBill();
					break enterCommand;
				case "0":
					System.out.println("Выход из меню");
					break enterCommand;
				default:
					System.out.println("Такого действия не существует");
				}
				printMenu();
				command = scan.next();
			}
		}
	}

	public void manageProducts(Scanner scan) {
		printMenuOfProducts();
		String command = scan.next();

		enterProduct: {
			while (!"0".equals(command)) {
				switch (command) {
				case "1":
					System.out.println("Добавить шоколад");
					Chocolate chocolate = new Chocolate();
					setProductInfo(scan, chocolate);
					System.out.println("Введите вид шоколада");
					chocolate.setType(scan.nextLine());
					addProduct(chocolate);
					printMenuOfProducts();
					break;
				case "2":
					System.out.println("Добавить кофе");
					Coffee coffee = new Coffee();
					setProductInfo(scan, coffee);
					System.out.println("Введите наличие кофеина");
					coffee.setCaffeine(scan.nextLine());
					addProduct(coffee);
					printMenuOfProducts();
					break;
				case "3":
					System.out.println("Добавить вино");
					Wine wine = new Wine();
					setProductInfo(scan, wine);
					System.out.println("Введите цвет вина");
					wine.setColour(scan.nextLine());
					addProduct(wine);
					printMenuOfProducts();
					break;
				case "0":
					System.out.println("Возврат в меню сделки");
					printMenu();
					manageDeal(scan);
					break enterProduct;
				default:
					System.out.println("Такого действия не существует");
				}
				command = scan.next();
			}
		}
	}

	private void printMenu() {
		System.out.println("Меню сделки");
		System.out.println("Введите номер для выполнения действия: ");
		System.out.println("1. Посмотреть список продуктов");
		System.out.println("2. Добавить продукт");
		System.out.println("3. Удалить продукт");
		System.out.println("4. Провести сделку");
		System.out.println("0. Выход из меню");
	}

	private void printMenuOfProducts() {
		System.out.println("Меню продуктов");
		System.out.println("Введите номер для выполнения действия: ");
		System.out.println("1. Добавить шоколад");
		System.out.println("2. Добавить кофе");
		System.out.println("3. Добавить вино");
		System.out.println("0. Возврат в меню сделки");
	}

	private void setProductInfo(Scanner scan, Product product) {
		System.out.println("Введите наименование продукта");
		scan.nextLine();
		product.setName(scan.nextLine());
		System.out.println("Введите стоимость продукта");
		product.setPrice(scan.nextDouble());
		scan.nextLine();
		System.out.println("Введите страну-производителя продукта");
		product.setCountryOfManufacture(scan.nextLine());
		System.out.println("Введите количество единиц данного продукта");
		product.setQuantity(scan.nextInt());
		scan.nextLine();
	}

	public double getFinalPrice() {
		double finalPrice = 0;
		if (products != null && products[0] != null) {
			for (Product position : products) {
				if (position != null) {
					finalPrice += position.calcFinalPrice();
				}
			}
		}
		return finalPrice;
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
	public void deleteProduct(String name) {

		int indexOfProduct = -1;
		for (int i = 0; i < products.length; i++) {
			if (products[i] != null) {
				if (products[i].getName().equals(name)) {
					indexOfProduct = i;
					break;
				}
			}
		}
		if (indexOfProduct == -1) {
			System.out.println("Данного продукта не существует");
		} else {
			System.arraycopy(products, indexOfProduct + 1, products, indexOfProduct,
					productCounter - indexOfProduct - 1);
			products[--productCounter] = null;
			System.out.println("Продукт удален");
		}
	}

	@Override
	public void printProducts() {
		if (products != null && products[0] != null) {
			for (int i = 0; i < productCounter; i++) {
				System.out.println("Наименование: " + products[i].getName());
				System.out.println("Производитель: " + products[i].getCountryOfManufacture());
				System.out.println("Сумма продукта: " + products[i].calcFinalPrice());
				System.out.println("------------------------------------------");
			}
		} else {
			System.out.println("Продукты не были добавлены");
		}
	}

	public void registerDealDate(Scanner scan) {
		System.out.println("Введите дату совершения сделки в следующем формате: dd/MM/yyyy или dd-MM-yyyy");
		setDate(scan.nextLine());
		while (User.dateValidator.validate(date) == false) {
			System.out.println(
					"Вы ввели дату сделки не корректно."
					+ "\nВведите в указанном формате: dd/MM/yyyy или dd-MM-yyyy");
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
