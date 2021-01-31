package by.academy.homework.homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		String[] array = new String[2];
		boolean check = false;

		Scanner str = new Scanner(System.in);
		System.out.println("Введите 2 слова: ");
		do {
			for (int i = 0; i < 2; i++) {
				array[i] = str.nextLine();
				check = array[i].isBlank() || array[i].length() % 2 != 0;
				if (check == true) {
					System.out.println("Ввод слов некорректный. Повторите ввод");
					break;
				}
			}
		} while (check == true);

		str.close();

		String result = array[0].substring(0, array[0].length()/2) + array[1].substring(array[1].length()/2, array[1].length());

		System.out.println(Arrays.toString(array));
		System.out.println("Результат: " + result);

	}
}
