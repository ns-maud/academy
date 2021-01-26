package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task15 {
	public static void main(String[] args) {
//		15. Написать программу, 
//		которая по заданным значениям чисел a и b находит a в степени b. 
//		В запросе укажите допустимые значения этих переменных
//		( Например если а - дробное, то b не может быть отрицательным).
		
		
		System.out.println("Введите a: ");
		Scanner numA = new Scanner (System.in);
		double a = numA.nextDouble ();
		
		System.out.println("Введите b: ");
		Scanner numB = new Scanner (System.in);
		double b = numB.nextDouble ();
		
		double result = Math.pow (a,b);
		
		System.out.println(result);
		
		numA.close();
		numB.close();
	}
}
