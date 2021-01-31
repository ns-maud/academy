package by.academy.classwork.lesson5;

import java.util.Scanner;
import java.util.Arrays;

public class Task2 {

	public static void main(String[] args) {
//		2. ¬вести n строк с консоли. ”пор€дочить и вывести строки в пор€дке возрастани€ (убывани€) 
//		значений их длины.

		Scanner scan = new Scanner(System.in);
		System.out.println("¬ведите количество строк");
		int n = scan.nextInt();
		System.out.println("¬ведите строки");
		String[] array = new String[n];
		scan.nextLine();

		for (int i = 0; i < n; i++) {
			array[i] = scan.nextLine();
		}

		String temp;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (array[i].length() > array[j].length()) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(array));
		scan.close();

	}
}
