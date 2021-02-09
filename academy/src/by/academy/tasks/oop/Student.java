package by.academy.tasks.oop;

public class Student {

	protected String firstName;
	protected String lastName;
	protected int group;
	protected double averageMark;

	protected Student(String firstName, String lastName, int group, double averageMark) {
		this.averageMark = averageMark;
		this.group = group;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	protected int getScholarship() {
		if (averageMark == 5) {
			return 100;
		} else {
			return 80;
		}
	}
}
