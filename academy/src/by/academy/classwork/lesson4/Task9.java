package by.academy.classwork.lesson4;

public class Task9 {

	public static void main(String[] args) {
		// 9. ���� ����������� ����� �� 35 �� 87. ����� � ���������� �� �� ���, �������
		// ��� ������� �� 7 ���� ������� 1, 2 ��� 5.

		for (int i = 35; i <= 87; i++) {
			boolean check = (i % 7 == 1 || i % 7 == 2 || i % 7 == 5);
			if (check) {
				System.out.print(i + " ");
			}
		}
	}
}
