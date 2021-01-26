package by.academy.classwork.lesson4.arrays;

public class Task1 {

	public static void main(String[] args) {
//		«адача 1. —оздайте массив из всех чЄтных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку, 
//		отдел€€ один элемент от другого пробелом, а затем в столбик (отдел€€ один элемент от другого началом новой строки). 
//		ѕеред созданием массива подумайте, какого он будет размера.
//		2 4 6 Е 18 20
//		2
//		4
//		6
//		Е
//		20

		String str = "";

		int[] array = new int[10];
		int k = 0;
		for (int i = 2; i <= 20; i += 2) {
			array[k] = i;
			k++;
		}
		for (int i = 0; i < array.length; i++) {
			str += Integer.toString(array[i]) + " ";
		}

		System.out.println(str);
		str = "";

		for (int i = 0; i < array.length; i++) {
			str += Integer.toString(array[i]) + "\n";
		}

		System.out.println(str);
	}
}
