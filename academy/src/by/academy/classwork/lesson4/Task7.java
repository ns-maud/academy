package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// 7. ������ � ���������� 10 ��� �����. �������� ����� � ������ ���� �
		// ���������� ������� �� ���.

		for (int i = 1; i <= 10; i++) {
			System.out.print("������� ������ ����� �� ����:");
			Scanner a = new Scanner(System.in);
			double numA = a.nextDouble();

			System.out.print("������� ������ ����� �� ����:");
			Scanner b = new Scanner(System.in);
			double numB = b.nextDouble();

			if (numA > numB) {
				System.out.println("������� ����� " + i + " ����: "+ numA);
			} else {
				System.out.println("������� ����� " + i + " ����: " + numB);
			}
		}
	}
}
