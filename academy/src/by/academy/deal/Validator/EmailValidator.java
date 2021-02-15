package by.academy.deal.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements Validator {

	@Override
	public boolean validate(String email) {
		Pattern pattern = Pattern.compile("\\w+@\\w+\\.[a-zA-Z]+{2,4}");
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
}