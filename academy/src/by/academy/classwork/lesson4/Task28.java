package by.academy.classwork.lesson4;

public class Task28 {

	public static void main(String[] args) {
		// 28. ���������� ���� ����� m ����� ������ � ����� ��� 20% �������. �����
		// ������� ��� ��� ���� �������� s ����� ������, ���� �� ��� ����� �� �� �����
		// �������� ����.

		double m = 240_000;
		double percent = 0.2;
		double max = 500_000;
		int years = 0;
		for (int i = 1; m < max; i++) {
			years++;
			m = m + m * percent;
		}
		System.out.println("����� " + years + " ���");
	}
}
