package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task2class {

	public static void main(String[] args) {
//		// 1. � ������� ������ Scanner ������ ����� �����. 
//		���� ��� ����� �� 0 �� 10, ������� �� ������� ��������� 
//		�������������� ����� ������ 10�, ����� ������� ��������� 
//		�������������� ����� ������ 10 ��� �������������. 
//		���������� �������� if-else. 

		System.out.println("������� �����: ");
		Scanner n = new Scanner(System.in);
		int number = n.nextInt();
		n.close();

		if (number >= 0 && number <= 10) {
			System.out.println("������������� ����� ������ 10");
		} else {
			System.out.println("������������� ����� ������ 10 ��� �������������");
		}
	}
}
