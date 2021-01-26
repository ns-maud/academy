package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// 7. Ввести с клавиатуры 10 пар чисел. сравнить числа в каждой паре и
		// напечатать большие из них.

		for (int i = 1; i <= 10; i++) {
			System.out.print("Введите первое число из пары:");
			Scanner a = new Scanner(System.in);
			double numA = a.nextDouble();

			System.out.print("Введите второе число из пары:");
			Scanner b = new Scanner(System.in);
			double numB = b.nextDouble();

			if (numA > numB) {
				System.out.println("Большее число " + i + " пары: "+ numA);
			} else {
				System.out.println("Большее число " + i + " пары: " + numB);
			}
		}
	}
}
