package by.academy.tasks.generics.task8;

public class MinMaxDemo {

	public static void main (String ... args) {
		Double [] array = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		
		MinMax <Double> minMax = new MinMax <> (array);
		minMax.getMinMaxValue();
		
		
	}
}
