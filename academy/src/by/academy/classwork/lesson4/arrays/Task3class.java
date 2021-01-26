package by.academy.classwork.lesson4.arrays;
import java.util.Arrays;

public class Task3class {

	public static void main(String[] args) {
//		// 2. Создать массив типа String размером 3х6. И записать в него значения:
//		a1  a2  a3  a4  a5  a6
//		b1  b2  b3  b4  b5  b6
//		c1  c2   c3  c4  c5  c6
//		И распечатать.

		char x = 'a';
		
		String [][] table = new String [3][6];
		for (int i=0; i<table.length; i++) {
			
			for (int j = 0; j < table [0].length; j++) {
			table [i][j] = x + Integer.toString(j+1);
		}
			x++;
		
	}
		System.out.println(Arrays.deepToString (table));

}}
