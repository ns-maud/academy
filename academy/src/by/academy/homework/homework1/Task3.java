package by.academy.homework.homework1;

import java.util.Scanner;
public class Task3 {

	public static void main(String[] args) {
		
		int result;
		int number;
		
		System.out.println("¬ведите число от 1 до 10");
		Scanner num = new Scanner (System.in);
		number = num.nextInt();
		
		for (int i=1; i<10; i++) {
		result = number*i;
		System.out.println(number + " * " + i +" = " + result);
		num.close();
		}
	}
}
