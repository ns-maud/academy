package by.academy.classwork.lesson4;

public class Task30 {

	public static void main(String[] args) {
		// 30. С помощью оператора while напишите программу определения суммы всех
		// нечетных чисел в диапазоне от 1 до 99 включительно.

		int x = 0;
		while (x < 99) {
			x++;
			if (x % 2 != 0) {
				System.out.print(x + " ");
			}
		}
	}
}
