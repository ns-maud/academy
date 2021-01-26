package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// Составьте программу, которая вычисляет произведение чисел от 1 до n.значение
		// n вводится с клавиатуры.

		int result = 1;
		System.out.println("Введите число n: ");
		Scanner n = new Scanner(System.in);
		int num = n.nextInt();
		n.close();

		for (int i = 1; i <= num; i++) {
			result = result*i;
		}
		System.out.println("Произведение чисел от 1 до n = " + result);
	}
}
