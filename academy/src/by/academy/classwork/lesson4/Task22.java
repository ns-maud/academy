package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task22 {

	public static void main(String[] args) {
		// 22. ���� ����������� n. ���������: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.

		System.out.println("������� ����������� �����: ");
		Scanner n = new Scanner(System.in);
		int num = n.nextInt();
		n.close();
		double sum = 0;

		for (double i = 1; i <= num; i++) {
			sum = sum + 1 / i;
		}
		System.out.println(sum);
	}
}
