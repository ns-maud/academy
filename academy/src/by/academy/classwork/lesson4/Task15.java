package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task15 {
	public static void main(String[] args) {
//		15. �������� ���������, 
//		������� �� �������� ��������� ����� a � b ������� a � ������� b. 
//		� ������� ������� ���������� �������� ���� ����������
//		( �������� ���� � - �������, �� b �� ����� ���� �������������).
		
		
		System.out.println("������� a: ");
		Scanner numA = new Scanner (System.in);
		double a = numA.nextDouble ();
		
		System.out.println("������� b: ");
		Scanner numB = new Scanner (System.in);
		double b = numB.nextDouble ();
		
		double result = Math.pow (a,b);
		
		System.out.println(result);
		
		numA.close();
		numB.close();
	}
}
