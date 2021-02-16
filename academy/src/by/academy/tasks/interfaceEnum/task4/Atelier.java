package by.academy.tasks.interfaceEnum.task4;

public class Atelier {

	public static void main(String[] args) {
		Clothes[] clothes = new Clothes[4];
		clothes[0] = new Skirt(ClothingSize.M, 250, "Red");
		clothes[1] = new TeeShirt(ClothingSize.S, 152, "White");
		clothes[2] = new Tie(ClothingSize.XS, 90, "Black");
		clothes[3] = new Trousers(ClothingSize.L, 340, "Blue");

		for (Clothes c : clothes) {
			c.dressWomen();
			c.dressMan();
			System.out.println(
					"Размер " + c.getSize() + " соответствует европейскому размеру " + (c.getSize()).getEuroSize());
			System.out.println(c.getSize() + " - " + (c.getSize()).getDescription());
			System.out.println();
		}
	}
}