package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task3class {

	public static void main(String[] args) {
//		// 2. �������� �� ���� ��������� ����� �� 1 �� 7 � �������� ���������. 
//		���� ����� ����� 1, ������� �� ������� ������������, 2 ��������� � 
//		��� �����. ���� 6 ��� 7 � ���������. ���������� ����������� if-else-if. 

		System.out.println("������� �����: ");
		Scanner numX = new Scanner(System.in);
		int x = numX.nextInt();
		numX.close();
		
		if (x == 1) {
			System.out.println("�����������");
		} else if (x == 2) {
			System.out.println("�������");
		} else if (x == 3) {
			System.out.println("�����");
		} else if (x == 4) {
			System.out.println("�������");
		} else if (x == 5) {
			System.out.println("�������");
		} else if (x == 6) {
			System.out.println("�������");
		} else if (x == 7) {
			System.out.println("�����������");
		} else {
			System.out.println("����� �� �� 1 �� 7");
		}
	}
}
