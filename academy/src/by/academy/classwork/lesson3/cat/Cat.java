package by.academy.classwork.lesson3.cat;

public class Cat {

	int age;
	String nickname;
	double money;
	char initials;
	boolean isHomeAnimal;
	
	
	public Cat () {
		super ();
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
	
	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	
	public char getInitials () {
		initials = nickname.charAt(0);
		return initials;
	}

	public void setInitials(char initials) {
		this.initials = initials;
	}
	
	public boolean getHomeAnimal () {
		return isHomeAnimal;
	}

	public void setHomeAnimal(boolean isHomeAnimal) {
		this.isHomeAnimal = isHomeAnimal;
	}

}