package by.academy.classwork.lesson4;

public class Task11 {

	public static void main(String[] args) {
		// 11. Напечатать те из двузначных чисел которые делятся на 4, но не делятся на 6.

		for (int i=10; i<=99; i++) {
			boolean check = (i % 4 == 0 && i % 6 !=0);
				if (check) {
					System.out.print(i + " ");
				}
			}
		}
	}
