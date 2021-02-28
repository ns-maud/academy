package by.academy.homework.homework4.task1;

import java.text.ParseException;
import java.util.Scanner;

import by.academy.homework.homework4.task1.DateInnerClasses.Day;
import by.academy.homework.homework4.task1.DateInnerClasses.Year;


public class DateApplication {

	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		
		DateInnerClasses dateInnerClasses = new DateInnerClasses ();
		
		System.out.println("Введите дату в формате dd-MM-yyyy:");
		dateInnerClasses.setUserDate(scan);
		
		System.out.println("Введите дату в формате dd-MM-yyyy для расчета временного промежутка между датами:");
		dateInnerClasses.setSecondUserDate(scan);
		
		System.out.println("Разница между датами: " + dateInnerClasses.calcDaysBetweenTwoDates() + " дней.");
		
		Year year = dateInnerClasses.new Year();
		year.isLeapYear(year.getYear());
		
		Day day = dateInnerClasses.new Day();
		day.getDayOfWeek();;
		
		scan.close();
	}

}
