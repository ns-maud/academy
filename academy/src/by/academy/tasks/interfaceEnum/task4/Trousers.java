package by.academy.tasks.interfaceEnum.task4;

public class Trousers extends Clothes implements MensClothing, WomensClothing  {

	
	public Trousers (ClothingSize size, double price, String colour) {
		super(size, price, colour);
	}
	
	@Override
	public void dressWomen() {
		System.out.println("Размер женских брюк: " + size);
		System.out.println("Цена: " + price);
		System.out.println("Цвет женских брюк: " + colour);
	}

	@Override
	public void dressMan() {
		System.out.println("Размер мужских брюк: " + size);
		System.out.println("Цена: " + price);
		System.out.println("Цвет мужских брюк: " + colour);
	}

}
