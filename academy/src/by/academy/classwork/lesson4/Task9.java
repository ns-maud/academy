package by.academy.classwork.lesson4;

public class Task9 {

	public static void main(String[] args) {
		// 9. даны натуральные числа от 35 до 87. Найти и напечатать те из них, которые
		// при делении на 7 дают остаток 1, 2 или 5.

		int result = 0;
		for (int i = 35; i < 87; i++) {
			result = i % 7;
			if (result == 1 || result == 2 || result == 5) {
				System.out.println(i);
			}
		}
	}
}
