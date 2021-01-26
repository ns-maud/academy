package by.academy.classwork.lesson4;

public class Task1 {

	// 1. Составьте программу, выводящую на экран квадраты чисел от 10 до 20.

	public static void main(String[] args) {
		int result;
		for (int i = 10; i < 21; i++) {
			result = i * i;
			System.out.println(i + " в квадрате = " + result);
		}
	}
}
