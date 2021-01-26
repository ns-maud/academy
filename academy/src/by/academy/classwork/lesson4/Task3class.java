package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task3class {

	public static void main(String[] args) {
//		// 2. Передать на вход программы число От 1 до 7 в качестве аргумента. 
//		Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и 
//		так далее. Если 6 или 7 – “Выходной”. Используем конструкцию if-else-if. 

		System.out.println("Введите число: ");
		Scanner numX = new Scanner(System.in);
		int x = numX.nextInt();
		numX.close();
		
		if (x == 1) {
			System.out.println("Понедельник");
		} else if (x == 2) {
			System.out.println("Вторник");
		} else if (x == 3) {
			System.out.println("Среда");
		} else if (x == 4) {
			System.out.println("Четверг");
		} else if (x == 5) {
			System.out.println("Пятница");
		} else if (x == 6) {
			System.out.println("Суббота");
		} else if (x == 7) {
			System.out.println("Воскресенье");
		} else {
			System.out.println("Число не от 1 до 7");
		}
	}
}
