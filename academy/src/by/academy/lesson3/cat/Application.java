package by.academy.lesson3.cat;

public class Application {

	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Cat cat2 = new Cat("Васька");
		
		System.out.println("cat1");
		cat1.eat();
		cat1.grow();
		cat1.sleep();
		cat1.walk();
		
		System.out.println("cat2");
		cat2.eat();
		cat2.grow();
		cat2.grow();
		cat2.grow();
		cat2.sleep();
		cat2.walk();
		
		System.out.println(cat2.getAge());
	}

}
