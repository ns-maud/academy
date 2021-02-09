package by.academy.tasks.oop;

public class PersonApplication {

	public static void main(String[] args) {
		
		Person person1 = new Person ();
		Person person2 = new Person ("Коля", 21);
		
		person1.fullName = "Aгата";
		
		System.out.println(person1);
		System.out.println(person2);
		
		person1.move();
		person1.talk();
		
		person2.move();
		person2.talk();
	
	}
}
