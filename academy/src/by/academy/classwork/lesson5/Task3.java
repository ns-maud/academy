package by.academy.classwork.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
//		3. ������ n ����� � �������. ������� �� ������� �� ������, ����� ������� ������ (������) 
//		�������, � ����� �����.

		Scanner scan = new Scanner(System.in);
		System.out.println("������� ���������� �����");
		int n = scan.nextInt();
		System.out.println("������� ������");
		String[] array = new String[n];
		scan.nextLine();

		double average = 0;
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextLine();
			average = average + (double)array[i].length() / n;
		}

		for (int i = 0; i < n; i++) {
			if (array[i].length() < average) {
				System.out.println(array[i] + ". ����� ������: " + array[i].length());
			}
		}
		scan.close();
	}
}
