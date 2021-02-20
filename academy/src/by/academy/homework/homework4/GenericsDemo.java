package by.academy.homework.homework4;

public class GenericsDemo {

	public static void main(String[] args) {

		Generics <Integer> array = new Generics <Integer> ();
		
		array.addObject(5);
		array.addObject(7);
		array.addObject(9);
		array.addObject(11);
		array.addObject(13);
		System.out.println(array.toString());
		
		array.removeObjectByIndex(3) ;
		array.removeObjectByName(5) ;
		array.getArrayLength() ;
		
	System.out.println(	
		
		array.getFirst() +"\n" +
		array.getLast() +"\n" +
		array.getLastElementIndex() +"\n" +
		array.getObjectByIndex(4));
	System.out.println(array.toString());
	}

}
