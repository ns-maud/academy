package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		// 14. ��������� ���������, ������� ��������� ����� ��������� ����� �� 1 ��
		// ���������� ���� ������ ����� N.

		System.out.println("������� ����� �����: ");
		Scanner n = new Scanner(System.in);
		int num = n.nextInt();
		n.close();
		int result = 0;

		for (int i = 1; i <= num; i++) {
			int square = i * i;
			System.out.println("������� ����� " + i + " ����� " + square);
			result = result + square;
		}
		System.out.println("\n����� ��������� = " + result);
	}

}
