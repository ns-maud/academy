package by.academy.deal;

public class Deal {

	public static void main(String[] args) {

		Product Whiskey = new Product("Jameson", 30, 2, "Ireland");
		System.out.println(Whiskey.getQuantityAfterPurchase(2));

		Coffee latte = new Coffee("Молотый", 1, "Без молока");
		latte.quantity = 1;
		latte.manufacturer = "Africa";
		latte.addSugar(1);

		Sigarettes kent = new Sigarettes("С ментолом");
		kent.quantity = 1;
		kent.getMoodOfTheDay();
		System.out.println(kent);

	}

}
