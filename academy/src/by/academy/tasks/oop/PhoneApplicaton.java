package by.academy.tasks.oop;

public class PhoneApplicaton {

	public static void main(String[] args) {

		Phone phone1 = new Phone("+375 29 1111111", "Samsung", 243.5);
		Phone phone2 = new Phone("+375 29 2222222", "Huawei");
		Phone phone3 = new Phone("+375 29 3333333", "Xiaomi");

		System.out.println(phone1);
		System.out.println(phone2);
		System.out.println(phone3);

		phone1.receiveCall("Вася");
		phone2.receiveCall("Петя");
		phone3.receiveCall("Даша");

		phone1.getNumber();
		phone2.getNumber();
		phone3.getNumber();

		phone1.receiveCall("Вася", "+375 29 1234567");

		phone1.sendMessage("+375 29 1111111", "+375 29 1111112");

	}

}
