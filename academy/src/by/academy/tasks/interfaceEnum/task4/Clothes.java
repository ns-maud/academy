package by.academy.tasks.interfaceEnum.task4;

public abstract class Clothes implements MensClothing, WomensClothing {
	
	public double price;
	public String colour;
	ClothingSize size;
	
	public Clothes (ClothingSize size, double price, String colour) {
		this.size = size;
		this.price = price;
		this.colour = colour;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public ClothingSize getSize() {
		return size;
	}

	public void setSize(ClothingSize size) {
		this.size = size;
	}
	@Override
	public void dressWomen() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dressMan() {
		// TODO Auto-generated method stub
		
	}
}
