package by.academy.classwork.lesson4;

public class Task7class {

	public static void main(String[] args) {
		// 6. ����������� 5 �������� � ���� ������ ������� � �h�. ���������� ���� for.
		
		
		char symbol = 'h';
		int number = (int)symbol;
		
		for (int i=1; i<=5; i++) {
			System.out.println(symbol);
			number++;
			symbol=(char)number;
		}
	}
}
