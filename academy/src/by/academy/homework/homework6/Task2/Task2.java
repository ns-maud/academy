package by.academy.homework.homework6.Task2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {

	public static void main(String[] args) {

		try (BufferedWriter fileWriter = new BufferedWriter(
				new FileWriter("src\\by\\academy\\homework\\homework6\\Task2\\file.txt"))) {
			String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
					+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, "
					+ "when an unknown printer took a galley of type and scrambled it to make a type specimen book. "
					+ "It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. "
					+ "It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, "
					+ "and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
			fileWriter.write(text);
			fileWriter.close();
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

		try (BufferedReader reader = new BufferedReader(
				new FileReader("src\\by\\academy\\homework\\homework6\\Task2\\file.txt"));
				BufferedWriter resultWriter = new BufferedWriter(
						new FileWriter("src\\by\\academy\\homework\\homework6\\Task2\\result.txt"))) {
			int c;
			while ((c = reader.read()) != -1) {
				if ((char) c != ' ') {
					resultWriter.write((char) c);
				}
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
