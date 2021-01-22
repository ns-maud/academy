package by.academy.lesson3.cat;

public class Cat {

	int age;
	String nickname;
	
//3 варианта конструктора
	
	public Cat () {
		super ();
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Cat (String nickname) {
		super ();
		this.nickname = nickname;
	}
	
	public Cat (int age, String nickname) {
		super ();
		this.nickname = nickname;
		this.age = age;
	}

	public void grow() {
		age++;
	}

	public void sleep() {
		System.out.println("Sleep");
	}

	public void eat() {
		System.out.println("Eat");
	}

	public void walk() {
		System.out.println("Walk");
	}
}