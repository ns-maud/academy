package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// 2. Составьте программу, которая вычисляет сумму чисел от 1 до n.значение n
		// вводится с клавиатуры.

		int result = 0;
		System.out.println("Введите число n: ");
		Scanner n = new Scanner(System.in);
		int num = n.nextInt();
		n.close();

		for (int i = 1; i <= num; i++) {
			result = result + i;
		}
		System.out.println("Сумма чисел от 1 до n = " + result);
	}
}
