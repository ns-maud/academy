package by.academy.classwork.lesson4;

public class Task26 {

	public static void main(String[] args) {
		// 26. даны действительно х и натуральное n. вычислить: sin x + sin x в квадрате
		// + ... sin x в степени n.
		double x = 3.5;
		int n = 3;
		double result = 0;

		for (int i = 1; i <= n; i++) {
			double sin = Math.pow(Math.sin(x), i);
			result = result + sin;
		}
		
		System.out.println("Сумма равна = " + result);
	}
}
