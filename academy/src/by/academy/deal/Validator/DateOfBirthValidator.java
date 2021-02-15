package by.academy.deal.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateOfBirthValidator implements Validator {

	@Override
	public boolean validate(String dateOfBirth) {
		Pattern pattern = Pattern.compile("(0[1-9]|[12][0-9]|3[01])[-/](0[1-9]|1[012])[-/](19[0-9]{2}|20[0-9]{2})");
		Matcher matcher = pattern.matcher(dateOfBirth);
		return matcher.matches();
	}
}
