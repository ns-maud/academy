package by.academy.homework.homework1;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		String type;
		String variable;
						
		System.out.println("������� ��� ������:");
		Scanner t = new Scanner (System.in);
		type = t.nextLine ();
		
		System.out.println("������� ���������� ���������������� ����:");
		Scanner v = new Scanner (System.in);
		variable = t.nextLine ();
		
		System.out.println("��� ������:" + type);
		System.out.println("����������:" + variable);
		
		switch (type) {
		case "int":
			int actionInt = Integer.parseInt (variable)%2;
			variable = Integer.toString(actionInt);
			break;
		case "double":
			double actionDouble = Double.parseDouble (variable)*70/100;
			variable = Double.toString(actionDouble);
			break;
		case "float":
			float actionFloat = Float.parseFloat(variable);
			actionFloat = actionFloat*actionFloat;
			variable = Float.toString(actionFloat);
			break;
		case "char":
			int actionChar = variable.charAt(0);
			variable = Integer.toString(actionChar);
			break;
		case "String":
			variable = "Hello " + variable;
			break;
		default:
			variable = "Unsupported type";
			break;
		}
		
		
		System.out.println("��������� ��������: " + variable);
		
		t.close();
		v.close();
	}
}
