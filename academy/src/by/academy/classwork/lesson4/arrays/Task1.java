package by.academy.classwork.lesson4.arrays;

public class Task1 {

	public static void main(String[] args) {
//		������ 1. �������� ������ �� ���� ������ ����� �� 2 �� 20 � �������� �������� ������� �� ����� ������� � ������, 
//		������� ���� ������� �� ������� ��������, � ����� � ������� (������� ���� ������� �� ������� ������� ����� ������). 
//		����� ��������� ������� ���������, ������ �� ����� �������.
//		2 4 6 � 18 20
//		2
//		4
//		6
//		�
//		20

		String str = "";

		int[] array = new int[10];
		int k = 0;
		for (int i = 2; i <= 20; i += 2) {
			array[k] = i;
			k++;
		}
		for (int i = 0; i < array.length; i++) {
			str += Integer.toString(array[i]) + " ";
		}

		System.out.println(str);
		str = "";

		for (int i = 0; i < array.length; i++) {
			str += Integer.toString(array[i]) + "\n";
		}

		System.out.println(str);
	}
}
