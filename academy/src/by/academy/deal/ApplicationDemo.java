package by.academy.deal;

public class ApplicationDemo {
	
	public static void main(String[] args) {
		
		
		Deal deal = new Deal ();
		deal.addProduct(new Chocolate ("Milka", 7, 3, "Russia"));
		deal.addProduct(new Coffee("Lavazza", 12, 1, "Italy"));
		deal.addProduct(new Sigarettes ("Richmond", 5, 20, "Russia"));
		deal.addProduct(new Wine ("Chardonnay", 26, 2, "France", "White"));
		
		deal.getBill();
	}
}
