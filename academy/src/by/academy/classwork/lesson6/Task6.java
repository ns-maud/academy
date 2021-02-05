package by.academy.classwork.lesson6;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task6 {

	static Pattern template = Pattern.compile("\\w+@[a-z]+\\.[a-z]+{2,3}");

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine().toLowerCase();
		scan.close();

		System.out.println(str);
		System.out.println(validate(str));

	}

	private static boolean validate(String str) {
		str = str.trim();
		return template.matcher(str).matches();
	}
}
