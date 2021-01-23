package by.academy.classwork.lesson4;

public class Task12 {

	public static void main(String[] args) {
		// 12. Найти произведение двузначных нечетных чисел кратных 13.

		int x;
		int y = 1;
		for (int i=11; i<100; i+=2) {
			x = i % 13;
				if (x==0) {
					y=y*i;
				}
		}
		System.out.println(y);
		
	}

}
