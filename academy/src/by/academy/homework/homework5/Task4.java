package by.academy.homework.homework5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Task4 {

	public static void main(String[] args) {

		List<Integer> arrayList = new ArrayList<>();
		addMarks(arrayList);
		System.out.println("Список оценок: " + arrayList);

		Iterator<Integer> iterator = arrayList.iterator();
		Integer element = arrayList.get(0);
		while (iterator.hasNext()) {
			Integer nextElement = iterator.next();
			if (element < nextElement) {
				element = nextElement;
			}
		}
		System.out.println("Наивысшая оценка:" + element);
	}

	private static void addMarks(List <Integer> arrayList) {
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			arrayList.add(1 + rand.nextInt(10));
		}
	}
}
