package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		// 16. � �������, ���������� �� ������ ����, ������� N �����������.������
		// ����������� �������� m �����, � ������ ��������� �� 10 ����� ������, ���
		// ����������.������� ����� ����������� ��� �������?

		int minutes = 5 * 60; // �����������, ��� ������ ����������� �������� 5 �����
		int time = 0;
		System.out.println("������� ���������� �����������: ");
		Scanner s = new Scanner(System.in);
		int senokos = s.nextInt();

		s.close();

		for (int i = 1; i <= senokos; i++) {
			time = time + minutes;
			minutes += 10;
			System.out.println(time);
		}

		int hours = time / 60;

		System.out.println("����� ������ �������: " + hours + " �����");
	}

}
