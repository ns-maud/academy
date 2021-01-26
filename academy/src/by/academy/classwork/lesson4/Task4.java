package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// С клавиатуры вводятся n чисел. Составьте программу, которая определяет кол-во
		// отрицательных, кол-во положительных и кол-во нулей среди введеных
		// чисел.Значение n вводится с клавиатуры.

		int resultNeg = 0;
		int resultPos = 0;
		int resultZero = 0;
		int num = 0;

		System.out.println("Введите числа (после последнего числа введите 'end'):");
		Scanner n = new Scanner(System.in);
		while (n.hasNextInt() == true) {
			num = n.nextInt();

			if (num < 0) {
				resultNeg++;
			} else if (num > 0) {
				resultPos++;
			} else if (num == 0) {
				resultZero++;
			}
		}
		n.close();
		
		System.out.println("Количество отрицательных чисел :  " + resultNeg + "\nКоличество положительных чисел :  "
				+ resultPos + "\nКоличество нулей :  " + resultZero);

	}
}
