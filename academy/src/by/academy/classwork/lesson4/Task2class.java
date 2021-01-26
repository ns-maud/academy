package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task2class {

	public static void main(String[] args) {
//		// 1. С помощью класса Scanner ввести целое число. 
//		Если это число от 0 до 10, вывести на консоль сообщение 
//		“Положительное число меньше 10”, иначе вывести сообщение 
//		“Положительное число больше 10 или отрицательное”. 
//		Используем оператор if-else. 

		System.out.println("Введите число: ");
		Scanner n = new Scanner(System.in);
		int number = n.nextInt();
		n.close();

		if (number >= 0 && number <= 10) {
			System.out.println("Положительное число меньше 10");
		} else {
			System.out.println("Положительное число больше 10 или отрицательное");
		}
	}
}
