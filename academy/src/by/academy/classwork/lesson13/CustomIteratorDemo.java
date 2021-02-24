package by.academy.classwork.lesson13;

public class CustomIteratorDemo {


	public static void main(String[] args) {

		Integer [] array = {1,2,3,4,5,6,7,8};
		ArrayIterator <Integer> arrIterator = new ArrayIterator <Integer> (array);
		
		while (arrIterator.hasNext()) {
			Integer i = arrIterator.next();
			
			System.out.println(i);
		}
	}

}
