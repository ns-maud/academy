package by.academy.classwork.lesson5;

import java.util.Scanner;

public class Task1class {

	public static void main(String[] args) {
//		������� 1.
//
//		a) �������� �����, ������� ��������� � �������� ��������� ����� ������, �������� �I like Java!!!�. 
//		�) ����������� ��������� ������ ������. ���������� ����� String.charAt().
//		�) ���������, ������������� �� ���� ������ ���������� �!!!�. ���������� ����� String.endsWith().
//		�) ���������, ���������� �� ���� ������ ���������� �I like�. ���������� ����� String.startsWith(). 
//		�) ���������, �������� �� ���� ������ ��������� �Java�. ���������� ����� String.contains().
//		e) ����� ������� ��������� �Java� � ������ �I like Java!!!�.
//		�) �������� ��� ������� ��� �� ��. 
//		�) ������������ ������ � �������� ��������.
//		�) ������������ ������ � ������� ��������.
//		�) �������� ������ Java c ������� ������ String.substring().

		Scanner str = new Scanner (System.in);
		String s = str.nextLine();
		str.close();
		
		char lastSymbol = s.charAt(s.length()-1);
		System.out.println(lastSymbol);
		
		System.out.println (s.endsWith("!!!"));
		System.out.println (s.startsWith("I like"));
		System.out.println (s.contains("Java"));
		
		int x = s.indexOf("Java");
		System.out.println(s.indexOf("Java"));
		System.out.println(s.replace("a", "o"));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.substring(x, x+4));
	}

}
