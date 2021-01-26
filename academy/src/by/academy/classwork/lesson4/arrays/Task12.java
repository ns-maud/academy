package by.academy.classwork.lesson4.arrays;

import java.util.Arrays;
import java.util.Random;

public class Task12 {

	public static void main(String[] args) {
//		// «адача 12.
//		ѕрограмма должна создать массив из 12 случайных целых чисел из отрезка [-10;10] таким образом, чтобы отрицательных и положительных элементов там было поровну и не было нулей. 
//		ѕри этом пор€док следовани€ элементов должен быть случаен (т. е. не подходит вариант, когда в массиве посто€нно выпадает сначала 6 положительных, а потом 6 отрицательных чисел 
//		или же когда элементы посто€нно чередуютс€ через один и пр.). ¬ывести полученный массив на экран. 

		int[] array = new int[12];
		Random rand = new Random();
		int zer = 4;
		int k = 2;
		int m = 0;
		
		while (k != m || zer !=0) {
			k=0; m=0; zer=0;
			
			for (int i = 0; i < array.length; i++) {
				int r = rand.nextInt(21) - 10;
				array[i] = r;
			}
			
			for (int i = 0; i < array.length; i++) {
				if (array[i] > 0) {
					k++;
				}
				if (array[i] < 0) {
					m++;
				}
				if (array[i] == 0) {
					zer++;
				}
			}
	}
		System.out.println(k);System.out.println(m);
		System.out.println(zer);
		System.out.println(Arrays.toString(array));
}}
