package by.academy.classwork.lesson4.arrays;

import java.util.Arrays;

public class Task2 {

	public static void main(String[] args) {
//		Задача 2.
//		Создайте массив из всех нечётных чисел от 1 до 99, 
//		выведите его на экран в строку, а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).

		int[] array = new int[50];
		int k = 0;

		for (int i = 1; i <= 99; i += 2) {
			array[k] = i;
			k++;
		}
		System.out.println(Arrays.toString(array));

		k = 0;

		for (int j = 0; j < array.length; j++) {
			for (int m =0; m<array.length; m++) {
			if (array [j]>array [m]) {
				int temp = array [j];
				array [j]=array[m];
				array [m]=temp;
			}
		}
	}
		System.out.println(Arrays.toString(array));

	}}
