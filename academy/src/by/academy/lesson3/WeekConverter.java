package by.academy.lesson3;

public class WeekConverter {

	public static void main(String[] args) {
		
		int s = 370_000;
		
		int sec = s % 60;
		int m = (s-sec) / 60;
		int min = m % 60;
		int h = (m-min) / 60;
		int hours = h % 24;
		int d = (h-hours) / 24;
		int days = h % 7;
		int w = (d-days) / 7;
		int week = w % 7;

		System.out.println("sec = " + sec + "; min = " + min +"; h = " + hours +"; d = " + days +"; w = " + week);
		

	}

}
