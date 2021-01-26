package by.academy.classwork.lesson4;

public class Task25 {

	public static void main(String[] args) {
		// 25. Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)

		double a = 2.0;
		int n = 3;
		double result = 1;

		for (int i = 1; i < n; i++) {
			result = result * a * (a + i);
		}
		System.out.println("Результат = " + result);
	}
}
