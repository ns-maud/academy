package by.academy.deal;

public class Coffee extends Product {
	
	String type;
	int amountOfSugar;
	String milk;

	public Coffee () {
		super();
	}
	
	public Coffee (String type, int amountOfSugar, String milk) {
		super();
		this.type = type;
		this.amountOfSugar = amountOfSugar;
		this.milk = milk;
	}
	
	@Override
	public String toString() {
		return "Coffee [type=" + type + ", amountOfSugar=" + amountOfSugar + ", milk=" + milk + "]";
	}

	void addSugar (int amountOfSugar) {
		System.out.println("Добавить в кофе " + amountOfSugar + " сахара" );
	}
	
}
