package by.academy.classwork.lesson4.arrays;

import java.util.Random;

import java.util.Arrays;

public class Task5class {

	public static void main(String[] args) {
//		4. Создать двухмерный массив 5х8 и инициализировать 
//		его с помощью блока для инициализации. 
//		Найти максимальное и минимальное значение в каждой "строке" 
//		и записать эти значения в двухмерный массив 5х2. Распечатать оба массива.

		int[][] array = new int[5][8];
		int[][] second = new int[5][2];
		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
			array[i][j] = rand.nextInt(10);
			}
		}
		
		System.out.println("Начальный массив:");
		System.out.println(Arrays.deepToString(array));
		
		
		for (int i = 0; i < array.length; i++) {
			int min = array [i][0];
			int max = array [i][0];
			
			for (int j = 0; j < array[0].length; j++) {
				if (min>array[i][j]) {
					min = array[i][j];
				}
				if (max<array[i][j]) {
					max = array[i][j];
				}
			}
			
			second [i][0] = min;
			second[i][1]=max;
		}
		System.out.println("Конечный массив:");
		System.out.println(Arrays.deepToString(second));
		
		
		
		
}}
