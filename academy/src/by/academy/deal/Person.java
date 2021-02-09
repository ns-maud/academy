package by.academy.deal;

public class Person {

	protected String name;
	protected String phone;
	protected String email;
	protected double money;
	
	public Person (String name, String phone, String email, double money) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
}
