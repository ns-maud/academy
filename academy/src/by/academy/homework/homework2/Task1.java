package by.academy.homework.homework2;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		System.out.println("Введите 2 слова: ");
		Scanner str = new Scanner(System.in);
		String[] array = new String[2];
		for (int i = 0; i < 2; i++) {
			array[i] = str.nextLine();
		}
		str.close();

		boolean result = true;

		int[] symbols = new int[256];

		if (array[0].length() == array[1].length()) {

			for (int i = 0; i < array[0].length(); i++) {
				int sym = (int) array[0].charAt(i);
				symbols[sym]++;
			}

			for (int i = 0; i < array[1].length(); i++) {
				int sym = (int) array[1].charAt(i);
				if (symbols[sym] - 1 != 0) {
					result = false;
				}
			}

		} else {
			result = false;
		}
		System.out.println("Результат: " + result);
	}
}
