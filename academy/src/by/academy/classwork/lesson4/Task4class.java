package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task4class {

	public static void main(String[] args) {
		// 3. Переписать задание 3 используя switch. 

		System.out.println("Введите число от 1 до 7: ");
		Scanner n = new Scanner(System.in);
		int number = n.nextInt();
		n.close();
		
		switch (number) {
		
		case 1: 
			System.out.println("Понедельник");
			break;
		case 2:
			System.out.println("Вторник");
			break;
		case 3: 
			System.out.println("Среда");
			break;
		case 4: 
			System.out.println("Четверг");
			break;
		case 5: 
			System.out.println("Пятница");
			break;
		case 6: 
			System.out.println("Суббота");
			break;
		case 7: 
			System.out.println("Воскресенье");
			break;
		default:
			System.out.println("Число не от 1 до 7");
		}
	}

}
