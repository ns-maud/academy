package by.academy.classwork.lesson4;
import java.util.Scanner;
public class Task6 {

	public static void main(String[] args) {
		// 6. � ��������� �� ������������� ����� �������� S ������.����� ������ ����� ������ ����� N ���.
		
		System.out.println("������� ����� ������: ");
		Scanner s = new Scanner (System.in);
		double sum = s.nextDouble ();
		
		System.out.println("������� ��� �������� �����: ");
		Scanner n = new Scanner (System.in);
		double num = n.nextDouble ();
		double result = 0;
		
		double percent = 0.03;
		
		for (int i=1; i<=num; i++) {
			result =  sum+(percent*i*sum);
			
		}
		
		n.close();
		s.close();
		
		System.out.println(result);
	}

}
