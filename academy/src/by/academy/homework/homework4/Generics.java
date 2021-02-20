package by.academy.homework.homework4;

import java.util.Arrays;

public class Generics<T> {

	private T[] array;

	public Generics() {
		array = (T[]) new Object[16];
	}

	public Generics(int arrayLength) {
		array = (T[]) new Object[arrayLength];

	}

	public void addObject(T obj) {

		if (array == null) {
			return;
		}

		if (array[array.length - 1] != null) {
			T[] extendedArray = (T[]) new Object[array.length * 2 + 1];
			extendedArray = Arrays.copyOf(array, array.length);
			array = extendedArray;
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				array[i] = obj;
				break;
			}
		}
	}

	public T getObjectByIndex(int i) {
		if (i < array.length) {
			return array[i];
		}
		return null;
	}

	public T getLast() {
		return array[array.length - 1];
	}

	public T getFirst() {
		return array[0];
	}

	public void getArrayLength() {
		System.out.println(array.length);
	}

	public int getLastElementIndex() {
		int index = 0;
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] != null) {
				index = i;
				break;
			}
		}
		return index;
	}

	public void removeObjectByIndex(int i) {
		if (i < array.length) {
			array[i] = null;
		}
	}

	public void removeObjectByName(T obj) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null && array[i].equals(obj)) {
				array[i] = null;
			}
		}
	}

	@Override
	public String toString() {
		return "Generics [array=" + Arrays.toString(array) + "]";
	}
}
