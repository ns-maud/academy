package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		// 21. ���� ����������� n. ��������� 1/(2 � ��������) + 1/(4 � ��������)+ ... +
		// 1/(2n � ��������) ( � �������� ������ n)

		System.out.println("������� ����������� �����: ");
		Scanner n = new Scanner(System.in);
		int num = n.nextInt();
		n.close();
		double sum = 0;
		
		for (int i = 2; i<=(2*num); i*=2) {
			double square = i*i;
			sum = sum + 1 / square;
		}
	System.out.println(sum);
	}
}
