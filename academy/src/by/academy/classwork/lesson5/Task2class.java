package by.academy.classwork.lesson5;

public class Task2class {

	public static void main(String[] args) {
//		������� 2.
//
//		�) ���� ��� �����, �������� 3 � 56, ���������� ��������� ��������� ������: 
//			3 + 56 = 59 
//			3 � 56 = -53 
//			3 * 56 = 168. 
//			���������� ����� StringBuilder.append(). 
//		�) �������� ������ �=� �� ����� ������. 
//		����������� ������ StringBuilder.insert(), StringBuilder.deleteCharAt(). 
//		�) �������� ������ �=� �� ����� ������. 
//		����������� ������ StringBuilder.replace().

		int x = 3;
		int y = 56;

		String str = Integer.toString(x);
		StringBuilder s1 = new StringBuilder(str);
		StringBuilder s2 = new StringBuilder(str);
		StringBuilder s3 = new StringBuilder(str);
		s1.append(" + " + y + " = " + (x + y));
		s2.append(" - " + y + " = " + (x - y));
		s3.append(" * " + y + " = " + (x * y));

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

//		System.out.println(s1.replace(7, 8, "�����"));

		System.out.println(s1.deleteCharAt(7).insert(7, "�����"));
		System.out.println(s2.deleteCharAt(7).insert(7, "�����"));
		System.out.println(s3.deleteCharAt(7).insert(7, "�����"));

	}

}
