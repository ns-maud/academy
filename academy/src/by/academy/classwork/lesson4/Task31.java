package by.academy.classwork.lesson4;

public class Task31 {

	public static void main(String[] args) {
		// 31. ������� ����� ����� ������� M ������. �� ���� ��������������� ����������
		// ����� ������ �����. ��� ������ �� ������������� ����� ��������� � ���������.
		// ��������� ������ ������ ��������� � ���, ��� ��������� �� �������, ���� �����
		// ���������� ����� ����� ������ �����, ��� �������.

		double m = 15;
		double piece = 3;
		double result = 0;
		int num = 0;

		for (int i = 1; result < m; i++) {
			result = piece * i;
			num++;
		}

		System.out.println("����� ����� �� ������� ����� " + num + " ����������");
	}
}
