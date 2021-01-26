package by.academy.classwork.lesson4;

public class Task8class {

	public static void main(String[] args) {
//		// 8. Реализовать подсчет факториала используя цикл for.
//		n! = 1*2*...*n;​
//		0! = 1;
//		5! = 1*2*3*4*5;
//	Число n задается случайным образом (используйте Math.random()).

		int number = (int) (Math.random() * 6);
		System.out.println(number);

		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		System.out.println("Факториал числа " + number + " = " + factorial);
	}
}
