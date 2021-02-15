package by.academy.deal.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator {

	@Override
	public boolean validate(String belarusPhone) {
		Pattern pattern = Pattern.compile("\\+375(29|44|33|25)[0-9]{7}");
		Matcher matcher = pattern.matcher(belarusPhone.trim());
		return matcher.matches();
	}
}