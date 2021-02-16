package by.academy.tasks.interfaceEnum.task4;

public class Skirt extends Clothes implements WomensClothing  {

	public Skirt (ClothingSize size, double price, String colour) {
		super(size, price, colour);
	}

	@Override
	public void dressWomen() {
		System.out.println("Размер юбки: " + size);
		System.out.println("Цена: " + price);
		System.out.println("Цвет юбки: " + colour);
		
	}

}
