package by.academy.classwork.lesson4;

public class Task10 {

	public static void main(String[] args) {
		// 10. ���� ����������� ����� �� 1 �� 50. ����� ����� ��� �� ���, �������
		// ������� �� 5 ��� �� 7.

		int sum = 0;
		for (int i = 1; i <= 50; i++) {
			boolean check = (i % 5 == 0 || i % 7 == 0);
			if (check) {
				System.out.print(i + " ");
				sum = sum + i;
			}
		}
		System.out.println("\n����� ����� = " + sum);
	}
}
