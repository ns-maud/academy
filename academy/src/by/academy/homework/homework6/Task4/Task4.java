package by.academy.homework.homework6.Task4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Task4 {
	public static void main(String[] args) {

		StringBuilder text = new StringBuilder();
		try (BufferedReader fileReader = new BufferedReader(
				new FileReader("src\\by\\academy\\homework\\homework6\\Task2\\file.txt"))) {
			int c;
			while ((c = fileReader.read()) != -1) {
				text.append((char) c);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		File catalog = new File("src\\by\\academy\\homework\\homework6\\Task4\\Directory");
		catalog.mkdirs();

		Random random = new Random();
		try (BufferedWriter result = new BufferedWriter(
				new FileWriter("src\\by\\academy\\homework\\homework6\\Task4\\result.txt"))) {

			for (int i = 1; i <= 100; i++) {
				File file = new File(catalog, i + ".txt");
				try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file))) {
					fileWriter.write(text.substring(0, random.nextInt(text.length() + 1)));
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
				result.write("Файл: " + file.getName() + ". Размер: " + file.length() + "\n");
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}