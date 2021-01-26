package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		// 17. В ЭВМ вводятся по очереди данные о росте N учащихся класса. Определить
		// средний рост учащихся класса.

		System.out.println("Введите рост учащегося (после последнего значения введите 'end'): ");
		Scanner h = new Scanner(System.in);

		int i = 0;
		double sum = 0;

		while (h.hasNextDouble() == true) {
			double height = h.nextDouble();
			sum = sum + height;
			i++;
			System.out.println(sum);
		}
		double average = sum / i;
		System.out.println(average);
	}

}
