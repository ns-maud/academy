package by.academy.homework.homework5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Task1 <T> {
	public static void main(String[] args) {
		List <Integer> arrayList = new ArrayList<> (Arrays.asList(1, 3, 5, 7 ,9 , 9, 9 ,11, 13, 11));
		System.out.println("Начальный вариант: " + arrayList);
		System.out.println("После удаления дубликатов: " + removeDuplicates (arrayList));
	}
	
	private static <T> Collection <T> removeDuplicates (Collection <T> collection) {
		return new HashSet <T> (collection);
	}
}
