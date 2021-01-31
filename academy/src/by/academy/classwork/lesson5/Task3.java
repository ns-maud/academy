package by.academy.classwork.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
//		3. Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше (больше) 
//		средней, а также длину.

		Scanner scan = new Scanner(System.in);
		System.out.println("Введите количество строк");
		int n = scan.nextInt();
		System.out.println("Введите строки");
		String[] array = new String[n];
		scan.nextLine();

		double average = 0;
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextLine();
			average = average + (double)array[i].length() / n;
		}

		for (int i = 0; i < n; i++) {
			if (array[i].length() < average) {
				System.out.println(array[i] + ". Длина строки: " + array[i].length());
			}
		}
		scan.close();
	}
}
