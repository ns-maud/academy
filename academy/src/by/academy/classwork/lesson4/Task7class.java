package by.academy.classwork.lesson4;

public class Task7class {

	public static void main(String[] args) {
		// 6. –аспечатать 5 символов в одну строку начина€ с СhТ. »спользуем цикл for.
		
		
		char symbol = 'h';
		int number = (int)symbol;
		
		for (int i=1; i<=5; i++) {
			System.out.println(symbol);
			number++;
			symbol=(char)number;
		}
	}
}
