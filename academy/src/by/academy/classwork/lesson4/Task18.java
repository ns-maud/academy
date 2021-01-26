package by.academy.classwork.lesson4;

public class Task18 {

	public static void main(String[] args) {
		// 18. Задано натуральное число N. Найти количество натуральных чисел, не
		// превосходящих N и не делящихся ни на одно из чисел 2,3,5.

		int n = 18;
		int k = 0;
		for (int i = 1; i <= 18; i++) {
			boolean check = (i % 2 != 0 && i % 3 != 0 && i % 5 != 0);
			if (check) {
				System.out.println(i);
				k++;
			}
		}
		System.out.println("Количество натуральных чисел = " + k);
	}
}
