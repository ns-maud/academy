package by.academy.classwork.lesson4;

public class Task30 {

	public static void main(String[] args) {
		// 30. � ������� ��������� while �������� ��������� ����������� ����� ����
		// �������� ����� � ��������� �� 1 �� 99 ������������.

		int x = 0;
		while (x < 99) {
			x++;
			if (x % 2 != 0) {
				System.out.print(x + " ");
			}
		}
	}
}
