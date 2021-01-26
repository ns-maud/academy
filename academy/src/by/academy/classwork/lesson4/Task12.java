package by.academy.classwork.lesson4;

public class Task12 {

	public static void main(String[] args) {
		// 12. Найти произведение двузначных нечетных чисел кратных 13.

		int result = 1;
		for (int i = 11; i <= 99; i += 2) {
			if (i % 13 == 0) {
				System.out.print(i+" ");
				result = result * i;
			}
		}
		System.out.println("\nПроизведение = " + result);
	}
}
