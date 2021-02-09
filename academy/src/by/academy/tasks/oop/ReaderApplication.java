package by.academy.tasks.oop;

import java.util.ArrayList;

public class ReaderApplication {

	public static void main(String[] args) {
		
		ArrayList<Reader> people = new ArrayList<Reader>();

		
		Book book1 = new Book ("Булгаков", "Мастер и Маргарита");
		Book book2 = new Book ("Булгаков", "Собачье сердце");
		Book book3 = new Book ("Толстой", "Война и мир");

		people.add (new Reader ("Иванов И.И."));
		people.add (new Reader ("Петров П.П."));
		
		people.get(0).takeBook(3);
		people.get(1).takeBook("Чипполино");
	
		people.get(0).takeBook(book1,book2,book3);
		people.get(1).returnBook (book1,book2);
	}

}
