package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task1class {

	public static void main(String[] args) {
//		// 0. �������� �� ���� ��������� ����� � �������� ���������. 
//		���� ��� ��������, ����������� ���. ���������� �������� if. 
//		����������� ����� Integer.parseInt() ��� �������������� �� String � int. 

		System.out.println("������� �����: ");
		Scanner n = new Scanner(System.in);
		int number = n.nextInt();
		n.close();

		if (number % 2 != 0) {
			System.out.println(number + " ��������");
		}

	}

}
