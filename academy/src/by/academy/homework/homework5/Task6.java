package by.academy.homework.homework5;

import java.util.Random;

public class Task6 {

	public static void main(String[] args) {
		Random rand = new Random ();
		int[] array = new int[8];
		try {
			for (int i = 0; i < 10; i++) {
				array[i] = rand.nextInt();
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array is too small, expand the array");
		}
	}
}
