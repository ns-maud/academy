package by.academy.homework.homework4.task1;

import java.util.Calendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class DateInnerClasses {

	private final DateValidator DateValidator = new DateValidator();
	private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	private final Calendar cal = Calendar.getInstance();

	private Date userDate;
	private Date secondUserDate;

	public DateInnerClasses() {
		super();
	}

	public void setUserDate(Scanner scan) throws ParseException {
		this.userDate = setDate(scan);
	}

	public Date getUserDate() {
		return userDate;
	}

	public Date getSecondUserDate() {
		return secondUserDate;
	}

	public void setSecondUserDate(Scanner scan) throws ParseException {
		this.secondUserDate = setDate(scan);
	}

	private Date setDate(Scanner scan) throws ParseException {
		String inputDate = scan.nextLine();
		while (DateValidator.validate(inputDate) == false) {
			System.out.println("Вы ввели дату не корректно.\nВведите в указанном формате: dd-MM-yyyy");
			inputDate = scan.nextLine();
		}
		return changeFormat(inputDate);
	}

	private Date changeFormat(String inputDate) throws ParseException {
		Date date = dateFormat.parse(inputDate);
		cal.setTime(date);
		return date;
	}

	public long calcDaysBetweenTwoDates() {
		return Math.abs(userDate.getTime() - secondUserDate.getTime()) / (24 * 60 * 60 * 1000);
	}

	public class Year {

		public int getYear() {
			cal.setTime(userDate);
			return cal.get(Calendar.YEAR);
		}

		public void isLeapYear(int year) {
			boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
			if (isLeapYear) {
				System.out.println(year + " високосный (366 дней).");
			} else {
				System.out.println(year + " не високосный (365 дней).");
			}
		}
	}

	public class Mounth {
		public int getMonth() {
			cal.setTime(userDate);
			return cal.get(Calendar.MONTH);
		}
	}

	public class Day {
		public int getDay(Date date) {
			cal.setTime(date);
			return cal.get(Calendar.DAY_OF_MONTH);
		}

		public void getDayOfWeek() {
			cal.setTime(userDate);
			int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
			System.out.println(Week.values()[dayOfWeek-1]);
		}
	}
}
