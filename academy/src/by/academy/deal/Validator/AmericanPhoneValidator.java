package by.academy.deal.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator {

	@Override
	public boolean validate(String americanPhone) {
		Pattern pattern = Pattern.compile("\\+1[0-9]{10}");
		Matcher matcher = pattern.matcher(americanPhone.trim());
		return matcher.matches();
	}
}
