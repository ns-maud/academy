package by.academy.tasks.oop;

public class Book {

	protected String author;
	protected String title;
	
	protected Book (String author, String title) {
		this.author = author;
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", title=" + title + "]";
	}
}
