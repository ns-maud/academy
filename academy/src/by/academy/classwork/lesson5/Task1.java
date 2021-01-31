package by.academy.classwork.lesson5;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
//		1. Ввести n строк с консоли, найти самую короткую и самую длинную строки. 
//		Вывести найденные строки и их длину.

		Scanner scan = new Scanner(System.in);
		System.out.println("Введите количество строк");
		int n = scan.nextInt();
		System.out.println("Введите строки");
		String[] array = new String[n];
		scan.nextLine();
		
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextLine();
		}
		
		int min = array[0].length();
		int max = array[0].length();
		String minString = array[0];
		String maxString = array[0];

		System.out.println(Arrays.toString(array));
		
		for (int i = 1; i < n; i++) {
			if (array[i].length() < min) {
				min = array[i].length();
				minString = array[i];
			} else if (array[i].length() > max) {
				max = array[i].length();
				maxString = array[i];
			}
		}
		
		System.out.println("Min: " + min);
		System.out.println("MinString: " + minString);
		System.out.println("Max: " + max);
		System.out.println("MaxString: " + maxString);

		scan.close();

	}

}