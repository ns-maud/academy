package by.academy.tasks.oop;

public class Person {

	protected String fullName;
	protected int age;

	public Person() {
	}

	public Person(String fullName, int age) {
		this.fullName = fullName;
		this.age = age;
	}

	protected void move() {
		System.out.println(fullName + " идет");
	}

	protected void talk() {
		System.out.println(fullName + " говорит");
	}

	@Override
	public String toString() {
		return "Person [fullName=" + fullName + ", age=" + age + "]";
	}
}