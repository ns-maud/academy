package by.academy.classwork.lesson4.arrays;

import java.util.Random;
import java.util.Arrays;

public class BaseTask {

	public static void main(String[] args) {
//		//   
//		����� � ������� �� ��������,
//		 �������� ������� ������ �������� ���������������,
//		  ������� �� ���� ��������� �������.
//
//		�������� ������� ������:
//
//		0) �������� ������ ���������� �������
//		1) ��������� ����� ���� ��������� �������. ��� ����� �� ����� �������� ���������� ��� ����� (��������, sum). 
//		����� � ����� ������������ �������� ������� � �������� ������� ����������� � ���� ����������. 
//		������� ����� ����� ��������� � ��� �� �����, ��� � ���������� �������.
//		2) ����� ����� ��������� ���������, ��������� ������� ��������������, 
//		������� ����� ����� ����������� �� ���������� ��������� �������.
//		3) ������ ������������ � �����, ������ ������� ������������ � ��������� ������� ���������. 
//		���� ������� ������, �� �� ��������� �� ����� (��� ����������� � ������ �������).

		int sum = 0;
		double average = 0;
		int counter = 0;
		
		int[] array = new int[10];
		Random rand = new Random();
		int[] mass = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10);
			sum = sum + array[i];
			average = (double) sum / array.length;
		}

		System.out.println(Arrays.toString(array));
		System.out.println("������� �������������� = " + average);

		for (int k = 0; k < array.length; k++) {
			if (array[k] < average) {
				mass[counter] = array[k];
				counter++;
			}
		}

		System.out.println(Arrays.toString(mass));
	}
}
