package by.academy.homework.homework6.Task1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {

		System.out.println("Введите текст.\nПосле окончания ввода введите 'stop'.");

		try (BufferedWriter fileWriter = new BufferedWriter(
				new FileWriter("src\\by\\academy\\homework\\homework6\\Task1\\file.txt"))) {
			Scanner scan = new Scanner(System.in);
			String text = scan.nextLine();
			while (!"stop".equals(text)) {
				fileWriter.write(text);
				fileWriter.append('\n');
				text = scan.nextLine();
			}
			scan.close();
			System.out.println("Запись в файл завершена.");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}