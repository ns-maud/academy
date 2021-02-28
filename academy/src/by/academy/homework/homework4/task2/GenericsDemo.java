package by.academy.homework.homework4.task2;

public class GenericsDemo {

	public static void main(String[] args) {

		Generics<Integer> array = new Generics<Integer>();

		array.addObject(5);
		array.addObject(7);
		array.addObject(9);
		array.addObject(11);
		array.addObject(13);
		array.addObject(15);
		array.addObject(17);
		array.addObject(18);
		array.addObject(20);

		System.out.println("Исходный массив: " + array.toString());

		array.removeObjectByIndex(4);
		
		System.out.println("Массив после удаления элемента по индексу: " + array.toString());

		array.removeObjectByName(15);
		
		System.out.println("Массив после удаления элемента по имени: " +array.toString());
		
		System.out.println("Первый элемент массива: " + array.getFirst());
		System.out.println("Последний элемент массива: " + array.getLast());
		System.out.println("Индекс последнего заполненного элемента массива: " + array.getLastElementIndex());
		System.out.println("Взятие элемента по индексу: " + array.getObjectByIndex(4));
		
		array.getArrayLength();
	}
}
