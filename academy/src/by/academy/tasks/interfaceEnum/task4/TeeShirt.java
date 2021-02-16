package by.academy.tasks.interfaceEnum.task4;

public class TeeShirt extends Clothes implements MensClothing, WomensClothing  {

	public TeeShirt (ClothingSize size, double price, String colour) {
		super(size, price, colour);
	}
	
	@Override
	public void dressWomen() {
		System.out.println("Размер женской футболки: " + size);
		System.out.println("Цена: " + price);
		System.out.println("Цвет женской футболки: " + colour);
		
	}

	@Override
	public void dressMan() {
		System.out.println("Размер мужской футболки: " + size);
		System.out.println("Цена: " + price);
		System.out.println("Цвет мужской футболки: " + colour);
		
	}

}
