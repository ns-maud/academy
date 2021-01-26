package by.academy.classwork.lesson4;

public class Task6class {

	public static void main(String[] args) {
//		// 5. –аспечатать все числа от 1 до 100, которые дел€тс€ на 5 без остатка. 
//		»спользуем цикл do-while.

		int x = 1;

		do {
			x++;
			if (x % 5 == 0) {
				System.out.println(x);
			}
		} while (x < 100);
	}
}
