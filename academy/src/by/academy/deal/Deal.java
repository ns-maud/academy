package by.academy.deal;

public class Deal {

	public static void main(String[] args) {
		
		Product Whiskey = new Product ("Jameson", 30, 2, "Ireland");
		System.out.println(Whiskey.getQuantityAfterPurchase (2));
		
		
		
		Coffee latte = new Coffee ("Молотый", 1, "Без молока");
		latte.quantity = 1;
		latte.manufacturer = "Africa";
		latte.addSugar (1);
		
		Sigarettes kent = new Sigarettes ("С ментолом");
		kent.quantity = 1;
		kent.getMoodOfTheDay();
		System.out.println(kent);
		
		
	//	5.	Даны два целых числа A и В. Выведите все числа от A до B включительно, в порядке возрастания, если A < B, или в порядке убывания в противном случае. Использовать рекурсию.
		
		int a =1;
		int b = 10;
		num (a,b);
		
	}
	
	static void num (int a, int b) {
		if (a<b) {
			a++;
			System.out.println(a);
			num(a,b);
			
		}
		
	}
}
