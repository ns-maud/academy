package by.academy.classwork.lesson4;
import java.util.Scanner;
public class Task6 {

	public static void main(String[] args) {
		// 6. В сберкассу на трёхпроцентный вклад положили S рублей.Какой станет сумма вклада через N лет.
		
		System.out.println("Введите сумму вклада: ");
		Scanner s = new Scanner (System.in);
		double sum = s.nextDouble ();
		
		System.out.println("Сколько лет хранится вклад: ");
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
