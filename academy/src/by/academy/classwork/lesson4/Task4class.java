package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task4class {

	public static void main(String[] args) {
		// 3. ���������� ������� 3 ��������� switch. 

		System.out.println("������� ����� �� 1 �� 7: ");
		Scanner n = new Scanner(System.in);
		int number = n.nextInt();
		n.close();
		
		switch (number) {
		
		case 1: 
			System.out.println("�����������");
			break;
		case 2:
			System.out.println("�������");
			break;
		case 3: 
			System.out.println("�����");
			break;
		case 4: 
			System.out.println("�������");
			break;
		case 5: 
			System.out.println("�������");
			break;
		case 6: 
			System.out.println("�������");
			break;
		case 7: 
			System.out.println("�����������");
			break;
		default:
			System.out.println("����� �� �� 1 �� 7");
		}
	}

}
