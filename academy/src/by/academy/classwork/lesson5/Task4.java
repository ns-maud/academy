package by.academy.classwork.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 { //  ����

	public static void main(String[] args) {
//		4. ������ n ���� � �������. ����� �����, � ������� ����� ��������� �������� ����������. 
//		���� ����� ���� ���������, ����� ������ �� ���.
		
		

		Scanner scan = new Scanner(System.in);
		System.out.println("������� ���������� ����");
		int n = scan.nextInt();
		System.out.println("������� �����");
		String[] array = new String[n];
		scan.nextLine();

		int counter = 0;
		int[] count = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextLine();
			int[] num = new int[array[i].length()];
			for (int j = 0; j < array[i].length(); j++) {
				num[j] = array[i].charAt(j);
				for (int k = j + 1; k < array[i].length(); k++) {
					if (num[j] == array[i].charAt(k)) {
						counter++;
						count[i] = counter;

					}
				}

			}
			System.out.println(counter);
			counter = 0;

		}
		int min = 0;
		for (int i = 0; i < n; i++) {
			for (int l = 0; l < n; l++) {
				if (count[i] < count[l]) {
					min = i;
				}

			}
		}
		System.out.println(array[min]);
	}
}
