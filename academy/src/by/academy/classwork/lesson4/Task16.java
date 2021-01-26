package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		// 16. ¬ бригаде, работающей на уборке сена, имеетс€ N сенокосилок.ѕерва€
		// сенокосилка работала m часов, а кажда€ следующа€ на 10 минут больше, чем
		// предыдуща€.—колько часов проработала вс€ бригада?

		int minutes = 5 * 60; // предположим, что перва€ сенокосилка работала 5 часов
		int time = 0;
		System.out.println("¬ведите количество сенокосилок: ");
		Scanner s = new Scanner(System.in);
		int senokos = s.nextInt();

		s.close();

		for (int i = 1; i <= senokos; i++) {
			time = time + minutes;
			minutes += 10;
			System.out.println(time);
		}

		int hours = time / 60;

		System.out.println("¬рем€ работы бригады: " + hours + " часов");
	}

}
