package by.academy.homework.homework5;

import java.util.HashMap;
import java.util.Map;

public class Task5 {

	public static void main(String[] args) {
		String text = "Три котенка - черный, серый и белый - увидели мышь и бросились за ней! Мышь прыгнула банку с мукой. Котята - за ней! "
				+ "Мышь убежала из банки вылезли три белых котенка. Три белых котенка увидели на дворе лягушку и бросились за ней! "
				+ "Лягушка прыгнула в старую самоварную трубу. Котята - за ней! Лягушка ускакала, а из трубы вылезли три черных котенка. "
				+ "Три черных котенка увидели в пруду рыбу и бросились за ней! Рыба уплыла, а из воды вынырнули три мокрых котенка. Три мокрых котенка пошли домой. "
				+ "По дороге они обсохли и стали как были: черный, серый и белый.";
		char[] textInChar = text.replaceAll("[^A-Za-zА-Яа-я]", "").toCharArray();
		Map<Character, Integer> hashMap = new HashMap<Character, Integer>();

		for (Character symbol : textInChar) {
			if (!hashMap.containsKey(symbol)) {
				hashMap.put(symbol, 0);
			}
			hashMap.put(symbol, hashMap.get(symbol) + 1);
		}

		for (Character symbol : hashMap.keySet()) {
			System.out.println("Символ " + symbol + " - " + hashMap.get(symbol));
		}
	}
}
