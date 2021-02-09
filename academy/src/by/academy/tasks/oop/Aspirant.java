package by.academy.tasks.oop;

public class Aspirant extends Student {

	protected String research;

	protected Aspirant(String firstName, String lastName, int group, double averageMark, String research) {
		super(firstName, lastName, group, averageMark);
		this.research = research;
	}

	@Override
	protected int getScholarship() {
		if (averageMark == 5) {
			return 200;
		} else {
			return 180;
		}
	}
}
