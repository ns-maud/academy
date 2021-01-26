package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task1class {

	public static void main(String[] args) {
//		// 0. Передать на вход программы число в качестве аргумента. 
//		Если оно нечетное, распечатать его. Используем оператор if. 
//		Используйте метод Integer.parseInt() для преобразования из String в int. 

		System.out.println("Введите число: ");
		Scanner n = new Scanner(System.in);
		int number = n.nextInt();
		n.close();

		if (number % 2 != 0) {
			System.out.println(number + " нечетное");
		}

	}

}
