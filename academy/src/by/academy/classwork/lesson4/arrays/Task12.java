package by.academy.classwork.lesson4.arrays;

import java.util.Arrays;
import java.util.Random;

public class Task12 {

	public static void main(String[] args) {
//		// ������ 12.
//		��������� ������ ������� ������ �� 12 ��������� ����� ����� �� ������� [-10;10] ����� �������, ����� ������������� � ������������� ��������� ��� ���� ������� � �� ���� �����. 
//		��� ���� ������� ���������� ��������� ������ ���� ������� (�. �. �� �������� �������, ����� � ������� ��������� �������� ������� 6 �������������, � ����� 6 ������������� ����� 
//		��� �� ����� �������� ��������� ���������� ����� ���� � ��.). ������� ���������� ������ �� �����. 

		int[] array = new int[12];
		Random rand = new Random();
		int zer = 4;
		int k = 2;
		int m = 0;
		
		while (k != m || zer !=0) {
			k=0; m=0; zer=0;
			
			for (int i = 0; i < array.length; i++) {
				int r = rand.nextInt(21) - 10;
				array[i] = r;
			}
			
			for (int i = 0; i < array.length; i++) {
				if (array[i] > 0) {
					k++;
				}
				if (array[i] < 0) {
					m++;
				}
				if (array[i] == 0) {
					zer++;
				}
			}
	}
		System.out.println(k);System.out.println(m);
		System.out.println(zer);
		System.out.println(Arrays.toString(array));
}}
