package by.academy.classwork.lesson4;

public class Task13 {

	public static void main(String[] args) {
		// 13. ����� ����� ����� �� 100 �� 200 ������� 17.
		int result = 0;
		for (int i = 100; i <= 200; i++) {
			if (i % 17 == 0) {
				System.out.print(i + " ");
				result = result + i;
			}
		}
		System.out.println("\n����� = " + result);
	}
}