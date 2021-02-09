package by.academy.tasks.oop;

public class Phone {

	protected String number;
	protected String model;
	protected double weight;

	protected Phone() {
	}

	protected Phone(String number, String model) {
		this.number = number;
		this.model = model;
	}

	protected Phone(String number, String model, double weight) {
		this(number, model);
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Phone [number=" + number + ", model=" + model + ", weight=" + weight + "]";
	}

	protected void receiveCall(String name) {
		System.out.println("Звонит " + name);
	}

	protected String getNumber() {
		return number;
	}

	protected void receiveCall(String name, String number) {
		System.out.println("Звонит " + name + ", номер " + number);
	}

	protected void sendMessage(String... message) {
		for (String number : message) {
			System.out.println(number);
		}

	}
}
