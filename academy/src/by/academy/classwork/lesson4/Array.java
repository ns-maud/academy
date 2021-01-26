package by.academy.classwork.lesson4;
import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6 };
		for (int i = 0; i < array.length; i++) {
			int temp;
			for (int n = 0; n < array.length; n++) {
				if (array[i] > array[n]) {
					temp = array[i];
					array [i] = array [n];
					array[n] = temp;
				}
				}

			}
		System.out.println("\n");
		for (int k : array) {
			System.out.println(k);;
		}

	}

}
