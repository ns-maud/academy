package by.academy.homework.homework1;

import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		
		double price;
		int age;
		int sale = 0;
		
		System.out.println("Введите сумму покупки в магазине:");
		Scanner p = new Scanner (System.in);
		price = p.nextDouble ();
		
		
		System.out.println("Введите возраст покупателя:");
		Scanner a = new Scanner (System.in);
		age = a.nextInt ();	
		
		System.out.println("Сумма покупки: " +  price + ".\nВозраст покупателя: " + age);
		
		
		if (price<100) {
			sale = 5;
		}	else if (price<200 && price>=100) {
			sale = 7;
			}
			else if (price<300 && price>=200) {
			sale = 12;
				if (age>=18) {
					sale+=4;
				}	else {
					sale-=3;
					}
			}
			else if (price<400 && price>=300) {
			sale = 15;
			}
			else if (price>=400) {
			sale = 20;
			}
		
		price = price*(100-sale)/100;
		System.out.println("Сумма со скидкой составила: " + price);
		
		a.close ();
		p.close();
	}
}
