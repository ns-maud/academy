package by.academy.deal;

public class Sigarettes extends Product {

	String flavor;

	public Sigarettes() {
		super();
	}

	public Sigarettes(String flavor) {
		super();
		this.flavor = flavor;
	}

	void getMoodOfTheDay() {
		if (quantity >= 1) {
			System.out.println("Значит все не так уж плохо на сегодняшний день");
		}
	}

	@Override
	public String toString() {
		return "Sigarettes [flavor=" + flavor + "]";
	}
}
