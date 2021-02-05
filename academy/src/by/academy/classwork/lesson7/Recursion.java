package by.academy.classwork.lesson7;

public class Recursion {

	public static void main(String[] args) {
//		5.	Даны два целых числа A и В. Выведите все числа от A до B включительно, в порядке возрастания, если A < B, или в порядке убывания в противном случае. Использовать рекурсию.

		int a = 1;
		int b = 10;
		num(a, b);

	}

	static void num(int a, int b) {
		if (a < b) {
			a++;
			System.out.println(a);
			num(a, b);

		}
	}
}
