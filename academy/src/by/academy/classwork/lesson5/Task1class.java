package by.academy.classwork.lesson5;

import java.util.Scanner;

public class Task1class {

	public static void main(String[] args) {
//		Задание 1.
//
//		a) Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”. 
//		б) Распечатать последний символ строки. Используем метод String.charAt().
//		в) Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
//		г) Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith(). 
//		д) Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
//		e) Найти позицию подстроки “Java” в строке “I like Java!!!”.
//		ж) Заменить все символы “а” на “о”. 
//		з) Преобразуйте строку к верхнему регистру.
//		и) Преобразуйте строку к нижнему регистру.
//		к) Вырезать строку Java c помощью метода String.substring().

		Scanner str = new Scanner (System.in);
		String s = str.nextLine();
		str.close();
		
		char lastSymbol = s.charAt(s.length()-1);
		System.out.println(lastSymbol);
		
		System.out.println (s.endsWith("!!!"));
		System.out.println (s.startsWith("I like"));
		System.out.println (s.contains("Java"));
		
		int x = s.indexOf("Java");
		System.out.println(s.indexOf("Java"));
		System.out.println(s.replace("a", "o"));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.substring(x, x+4));
	}

}
