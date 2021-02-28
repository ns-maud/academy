package by.academy.homework.homework4.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateValidator {
	
	Pattern pattern = Pattern.compile("(0[1-9]|[12][0-9]|3[01])[-](0[1-9]|1[012])[-](19[0-9]{2}|20[0-9]{2})");

	public boolean validate(String userDate) {
		Matcher matcher = pattern.matcher(userDate);
		return matcher.matches();
	}
}