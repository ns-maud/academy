package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// ��������� ���������, ������� ��������� ������������ ����� �� 1 �� n.��������
		// n �������� � ����������.

		int result = 1;
		System.out.println("������� ����� n: ");
		Scanner n = new Scanner(System.in);
		int num = n.nextInt();
		n.close();

		for (int i = 1; i <= num; i++) {
			result = result*i;
		}
		System.out.println("������������ ����� �� 1 �� n = " + result);
	}
}
