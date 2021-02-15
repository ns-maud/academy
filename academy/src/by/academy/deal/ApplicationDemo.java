package by.academy.deal;

import java.text.ParseException;

import by.academy.deal.Products.Chocolate;
import by.academy.deal.Products.Coffee;
import by.academy.deal.Products.Wine;

public class ApplicationDemo {

	public static void main(String[] args) throws ParseException {

		User seller = new User();
		User buyer = new User();
		seller.registerSeller();
		buyer.registerBuyer();

		Deal deal = new Deal();
		deal.registerDealDate();

		deal.addProduct(new Chocolate("Ritter Sport", 3, 20, "Germany", "Milk"));
		deal.addProduct(new Coffee("Lavazza", 15.0, 3, "Italy", "non-caffeine"));
		deal.addProduct(new Wine("Chadonnay", 26, 2, "France", "White"));
		deal.addProduct(new Wine("Cabernet", 34, 1, "Chile", "Red"));


		if (deal.getBill() > buyer.getMoney()) {
			System.out.println();
			System.out.println("Недостаточно средств для совершения сделки");
		} else {
			System.out.println();
			System.out.println("Сделка совершена");
			deal.printDeadlineDate();
		}
	}
}
