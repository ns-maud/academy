package by.academy.homework.homework1;

public class Task4 {

	public static void main(String[] args) {
		
		int baseDegree = 2;
		int result = 0;
		
		for (int i=1; result<1_000_000; i++) {
			result = (int)Math.pow(baseDegree, i);
			if (result<1_000_000) {
				System.out.println(baseDegree + " в степени " + i + " = " + result);
			}
		}
	}
}


