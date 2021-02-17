package by.academy.deal;

import java.text.ParseException;
import java.util.Scanner;

import by.academy.deal.Products.Chocolate;
import by.academy.deal.Products.Coffee;
import by.academy.deal.Products.Wine;

public class ApplicationDemo {

	public static void main(String[] args) throws ParseException {

	Scanner scan = new Scanner(System.in);
//		User seller = new User();
//		User buyer = new User();
//		seller.registerSeller();
//		buyer.registerBuyer();

		Deal deal = new Deal();
		deal.registerDealDate(scan);
		deal.manageDeal(scan);

//		if (deal.getFinalPrice() > buyer.getMoney()) {
//			System.out.println();
//			System.out.println("Недостаточно средств для совершения сделки");
//		} else {
//			System.out.println();
//			System.out.println("Сделка совершена");
//			deal.printDeadlineDate();
//		}
		scan.close();
	}
}
