package by.academy.lesson3;

//import java.util.Scanner;
//Scanner num1 = new Scanner (System.in);
//int number1 = num1.nextInt ();


public class Numbers {

	public static void main(String[] args) {
		
			
		int num1 = 3;
		int num2 = 5;
		
		if (num1 > num2) {
			System.out.println("Большее число = " + num1 + "\nМеньшее число = " + num2);
			} else {
				System.out.println("Большее число = " + num2+ "\nМеньшее число = " + num1);
			} 
			
		System.out.println("Среднее арифметическое = " + ((num1+num2)/2));
	}

}
