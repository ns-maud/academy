package by.academy.deal;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import by.academy.deal.Validator.BelarusPhoneValidator;
import by.academy.deal.Validator.DateOfBirthValidator;
import by.academy.deal.Validator.EmailValidator;

public class User {

	private Date dateOfBirth;
	private String email;
	private String phoneNumber;
	private String name;
	private double money;

	protected static final DateOfBirthValidator dateValidator = new DateOfBirthValidator();
	private final BelarusPhoneValidator phoneValidator = new BelarusPhoneValidator();
	private final EmailValidator emailValidator = new EmailValidator();

	public User() {
	}

	public User(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public User(String name, double money, Date dateOfBirth, String email, String phoneNumber) {
		this.name = name;
		this.money = money;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public void registerSeller() throws ParseException {
		System.out.println("Введите имя продавца:");
		Scanner scan = new Scanner(System.in);
		setName(scan.nextLine());

		System.out.println("Введите Ваш номер телефона в следующем формате: +375 ХХ ХХХ ХХ ХХ");
		phoneNumber = scan.nextLine();
		while (phoneValidator.validate(phoneNumber) == false) {
			System.out.println("Вы ввели номер телефона не корректно.\nВведите в указанном формате: +375 ХХ ХХХ ХХ ХХ");
			phoneNumber = scan.nextLine();
		}
		setPhoneNumber(phoneNumber);
	}

	public void registerBuyer() throws ParseException {
		System.out.println("Введите Ваше имя (покупателя):");
		Scanner scan = new Scanner(System.in);
		setName(scan.nextLine());

		System.out.println("Введите сумму, которую Вы готовы потратить:");
		setMoney(scan.nextDouble());

		scan.nextLine();
		System.out.println("Введите дату рождения в следующем формате: dd/MM/yyyy или dd-MM-yyyy");
		String dateOfBirth = scan.nextLine();

		while (dateValidator.validate(dateOfBirth) == false) {
			System.out.println(
					"Вы ввели дату рождения не корректно.\nВведите в указанном формате: dd/MM/yyyy или dd-MM-yyyy");
			dateOfBirth = scan.nextLine();
		}
		setDateOfBirth(dateOfBirth);

		System.out.println("Введите Ваш номер телефона в следующем формате: +375 ХХ ХХХ ХХ ХХ");
		phoneNumber = scan.nextLine();
		while (phoneValidator.validate(phoneNumber) == false) {
			System.out
					.println("Вы ввели номер телефона не корректно.\\nВведите в указанном формате: +375 ХХ ХХХ ХХ ХХ");
			phoneNumber = scan.nextLine();
		}
		setPhoneNumber(phoneNumber);

		System.out.println("Введите Вашу электронную почту");
		email = scan.nextLine();
		while (emailValidator.validate(email) == false) {
			System.out.println("Вы ввели электронную почту не корректно. Осуществите повторный ввод");
			email = scan.nextLine();
		}
		setEmail(email);
	}

	public void setDateOfBirth(String inputDate) throws ParseException {
		if (inputDate.contains("/")) {
			dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(inputDate);
		} else {
			dateOfBirth = new SimpleDateFormat("dd-MM-yyyy").parse(inputDate);
		}
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public DateOfBirthValidator getDateValidator() {
		return dateValidator;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
}
