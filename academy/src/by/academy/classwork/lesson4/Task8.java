package by.academy.classwork.lesson4;

public class Task8 {

	public static void main(String[] args) {
		// 8. ���� ����������� ����� �� 20 �� 50.���������� �� �� ���, ������� �������
		// �� 3, �� �� ������� �� 5.

		for (int i = 20; i <= 50; i++) {
			boolean check = (i % 3 == 0 && i % 5 != 0);
			if (check) {
				System.out.print(i + " ");
			}
		}
	}
}
