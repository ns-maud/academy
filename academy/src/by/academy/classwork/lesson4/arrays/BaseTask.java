package by.academy.classwork.lesson4.arrays;

import java.util.Random;
import java.util.Arrays;

public class BaseTask {

	public static void main(String[] args) {
//		//   
//		Найти в массиве те элементы,
//		 значение которых меньше среднего арифметического,
//		  взятого от всех элементов массива.
//
//		Алгоритм решения задачи:
//
//		0) Заполним массив рандомными числами
//		1) Посчитать сумму всех элементов массива. Для этого до цикла вводится переменная для суммы (например, sum). 
//		Далее в цикле перебираются элементы массива и значение каждого добавляется к этой переменной. 
//		Подсчет суммы можно выполнить в том же цикле, что и заполнение массива.
//		2) Когда сумма элементов посчитана, находится среднее арифметическое, 
//		которое равно сумме разделенной на количество элементов массива.
//		3) Массив перебирается в цикле, каждый элемент сравнивается с найденным средним значением. 
//		Если элемент меньше, то он выводится на экран (или сохраняется в другом массиве).

		int sum = 0;
		double average = 0;
		int counter = 0;
		
		int[] array = new int[10];
		Random rand = new Random();
		int[] mass = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10);
			sum = sum + array[i];
			average = (double) sum / array.length;
		}

		System.out.println(Arrays.toString(array));
		System.out.println("Среднее арифметическое = " + average);

		for (int k = 0; k < array.length; k++) {
			if (array[k] < average) {
				mass[counter] = array[k];
				counter++;
			}
		}

		System.out.println(Arrays.toString(mass));
	}
}
