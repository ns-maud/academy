package by.academy.homework.homework4.task3;

public class IteratorDemo {

	public static void main(String[] args) {

		Integer[][] arr = {{ 1, 2, 3, 4, 5 }, { 5, 4, 3, 2, 1 }};
		TwoDimArrayIterator<Integer> array = new TwoDimArrayIterator<Integer>(arr);

		while (array.hasNext()) {
			Integer i = array.next();
			System.out.print(i + " ");
		}
	}
}
