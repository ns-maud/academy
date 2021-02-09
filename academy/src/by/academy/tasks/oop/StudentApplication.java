package by.academy.tasks.oop;

import java.util.ArrayList;

public class StudentApplication {

	public static void main(String[] args) {
		ArrayList <Student> students = new ArrayList <Student> ();
		ArrayList <Aspirant> aspirants = new ArrayList <Aspirant> ();
		
		students.add(new Student ("Ivan","Ivanov", 3, 5));
		students.add(new Student ("Petr", "Petrov", 3, 2));
		students.add(new Student ("Sidr", "Sidorov", 3, 4));
		
		aspirants.add(new Aspirant ("Ivan","Ivanov", 3, 5, "N1"));
		aspirants.add(new Aspirant ("Petr","Petrov", 3, 2, "N2"));
		aspirants.add(new Aspirant ("Sidr", "Sidorov", 3, 4, "N3"));
		
		for (int i=0; i<students.size(); i++) {
			System.out.println("Размер стипендии студента " + students.get(i).lastName + ": " + students.get(i).getScholarship());
		}
		
		for (int i=0; i<aspirants.size(); i++) {
			System.out.println("Размер стипендии аспиранта " + aspirants.get(i).lastName + ": " + aspirants.get(i).getScholarship());
		}
	}

}
