package by.academy.tasks.interfaceEnum.task4;

public class Tie extends Clothes implements MensClothing {

	
	public Tie (ClothingSize size, double price, String colour) {
		super(size, price, colour);
	}
	
	@Override
	public void dressMan() {
		System.out.println("Размер галстука: " + size);
		System.out.println("Цена: " + price);
		System.out.println("Цвет галстука: " + colour);
		
	}

}
