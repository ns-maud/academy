package by.academy.homework.homework7.task1;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {

	public static void main(String[] args) {

		List<Long> list = generateLongList(100, 100);
		System.out.println("Начальный вариант: " + list);
		System.out.println("Конечный вариант: " +list.stream().map(i -> (i * Math.PI - 20)).filter(i -> i < 100).sorted().skip(3).distinct()
				.collect(Collectors.toMap(i -> i, i -> ("Number: " + i))));
	}

	private static List<Long> generateLongList(Integer seed, Integer size) {
		return Stream.generate(() -> (long) new Random().nextInt(seed)).limit(size).collect(Collectors.toList());
	}
}
