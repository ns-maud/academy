package by.academy.classwork.lesson4;

public class Task31 {

	public static void main(String[] args) {
		// 31. Имеется кусок ткани длинной M метров. От него последовательно отрезаются
		// куски равной длины. Все данные по использованию ткани заносятся в компьютер.
		// Компьютер должен выдать сообщение о том, что материала не хватает, если будет
		// затребован кусок ткани больше длины, чем имеется.

		double m = 15;
		double piece = 3;
		double result = 0;
		int num = 0;

		for (int i = 1; result < m; i++) {
			result = piece * i;
			num++;
		}

		System.out.println("Куска ткани не хватает после " + num + " требования");
	}
}
