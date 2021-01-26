package by.academy.classwork.lesson4;

public class Task10 {

	public static void main(String[] args) {
		// 10. Даны натуральные числа от 1 до 50. Найти сумму тех из них, которые
		// делятся на 5 или на 7.

		int sum = 0;
		for (int i = 1; i <= 50; i++) {
			boolean check = (i % 5 == 0 || i % 7 == 0);
			if (check) {
				System.out.print(i + " ");
				sum = sum + i;
			}
		}
		System.out.println("\nСумма чисел = " + sum);
	}
}
