package by.academy.classwork.lesson3.cat;

public class Application {

	public static void main(String... args) {
		Cat cat1 = new Cat();
		Cat cat2 = new Cat("������");

		System.out.println("cat1");
		cat1.eat();
		cat1.grow();
		cat1.sleep();
		cat1.walk();

		System.out.println("cat2");
		cat2.setHomeAnimal(true);
		cat2.eat();
		cat2.grow();
		cat2.grow();
		cat2.grow();
		cat2.sleep();
		cat2.walk();

		System.out.println(cat2.getAge());
		System.out.println("Initials = " + cat2.getInitials());
		System.out.println("Money = " + cat2.getMoney());
		System.out.println("isHomeAnimal = " + cat2.getHomeAnimal());
	}

}
