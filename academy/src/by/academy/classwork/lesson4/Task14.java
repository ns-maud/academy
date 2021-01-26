package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		// 14. Составьте программу, которая вычисляет сумму квадратов чисел от 1 до
		// введенного вами целого числа N.

		System.out.println("Введите целое число: ");
		Scanner n = new Scanner(System.in);
		int num = n.nextInt();
		n.close();
		int result = 0;

		for (int i = 1; i <= num; i++) {
			int square = i * i;
			System.out.println("Квадрат числа " + i + " равен " + square);
			result = result + square;
		}
		System.out.println("\nСумма квадратов = " + result);
	}

}
