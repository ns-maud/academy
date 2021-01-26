package by.academy.classwork.lesson4;

public class Task24 {
//24. Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).

	public static void main(String[] args) {

		int product = 1;
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
			product = product * sum;
		}
		System.out.println("Результат = " + product);
	}
}
