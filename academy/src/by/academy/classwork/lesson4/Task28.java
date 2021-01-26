package by.academy.classwork.lesson4;

public class Task28 {

	public static void main(String[] args) {
		// 28. Ѕизнессмен вз€л ссуду m тыс€ч рублей в банке под 20% годовых. через
		// сколько лет его долг превысит s тыс€ч рублей, если за это врем€ он не будет
		// отдавать долг.

		double m = 240_000;
		double percent = 0.2;
		double max = 500_000;
		int years = 0;
		for (int i = 1; m < max; i++) {
			years++;
			m = m + m * percent;
		}
		System.out.println("„ерез " + years + " лет");
	}
}
