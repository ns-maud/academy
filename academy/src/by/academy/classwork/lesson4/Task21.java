package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		// 21. Дано натуральное n. вычислить 1/(2 в квадрате) + 1/(4 в квадрате)+ ... +
		// 1/(2n в квадрате) ( в квадрате только n)

		System.out.println("Введите натуральное число: ");
		Scanner n = new Scanner(System.in);
		int num = n.nextInt();
		n.close();
		double sum = 0;
		
		for (int i = 2; i<=(2*num); i*=2) {
			double square = i*i;
			sum = sum + 1 / square;
		}
	System.out.println(sum);
	}
}
