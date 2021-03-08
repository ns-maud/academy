package by.academy.homework.homework5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task2 {
	
	private static Random rand = new Random();

	public static void main(String[] args) {

		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		
		addMillionObjects(arrayList, linkedList);
		System.out.println("Время выполнения для arrayList: " + getMethodTime(arrayList));
		System.out.println("Время выполнения для linkedList: " + getMethodTime(linkedList));
	}

	private static void addMillionObjects(List<Integer> arrayList, List<Integer> linkedList) {
		for (Integer i = 0; i < 1_000_000; i++) {
			arrayList.add(rand.nextInt());
			linkedList.add(rand.nextInt());
		}
	}

	private static long getMethodTime(List<Integer> list) {
		long timeOfBeginning = System.currentTimeMillis();
		for (int i = 0; i < 100_000; i++) {
			list.get(rand.nextInt(100_000));
		}
		long timeOfEnding = System.currentTimeMillis();
		return timeOfEnding - timeOfBeginning;
	}
}
