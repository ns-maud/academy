package by.academy.classwork.lesson4;

public class Task9 {

	public static void main(String[] args) {
		// 9. даны натуральные числа от 35 до 87. Найти и напечатать те из них, которые
		// при делении на 7 дают остаток 1, 2 или 5.

		for (int i = 35; i <= 87; i++) {
			boolean check = (i % 7 == 1 || i % 7 == 2 || i % 7 == 5);
			if (check) {
				System.out.print(i + " ");
			}
		}
	}
}
