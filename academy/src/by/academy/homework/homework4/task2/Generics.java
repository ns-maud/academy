package by.academy.homework.homework4.task2;

import java.util.Arrays;

public class Generics<T> {

	private T[] array;
	private int counter = 0;

	@SuppressWarnings("unchecked")
	public Generics() {
		super();
		this.array = (T[]) new Object[16];
	}

	@SuppressWarnings("unchecked")
	public Generics(int arrayLength) {
		super();
		this.array = (T[]) new Object[arrayLength];
	}

	public void addObject(T obj) {
		if (array.length == counter) {
			expandArray();
		}
		array[counter++] = obj;
	}

	@SuppressWarnings("unchecked")
	private void expandArray() {
		T[] tempArray = (T[]) new Object[array.length * 2 + 1];
		tempArray = Arrays.copyOf(array, array.length);
		array = tempArray;
	}

	public T getObjectByIndex(int i) {
		if (i >= 0 && i < counter) {
			return array[i];
		}
		return null;
	}

	public T getLast() {
		return array[counter - 1];
	}

	public T getFirst() {
		return array[0];
	}

	public void getArrayLength() {
		if (array == null) {
			System.out.println("Массив не содержит элементов");
		} else {
			System.out.println("Размер массива: " + counter);
		}
	}

	public int getLastElementIndex() {
		return counter - 1;
	}

	public void removeObjectByIndex(int index) {
		if (index < counter) {
			array[index] = null;
			shiftArray(index);
			counter--;
		} else {
			System.out.println("Элемента с данным индексом не существует");
		}
	}

	public void removeObjectByName(T obj) {
		for (int i = 0; i < counter; i++) {
			if (array[i] != null && array[i].equals(obj)) {
				array[i] = null;
				shiftArray(i);
				counter--;
				return;
			}
		}
		System.out.println("Элемента с данным именем не существует");
	}

	private void shiftArray(int index) {
		for (int i = index; i < counter - 1; i++) {
			array[i] = array[i + 1];
			array[i + 1] = null;
		}
	}
}
