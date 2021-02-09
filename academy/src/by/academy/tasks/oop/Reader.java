package by.academy.tasks.oop;


public class Reader {

	protected String name;
	protected int number;
	protected String faculty;
	protected String dateOfBirth;
	protected String phone;

	protected Reader(String name) {
		this.name = name;
	}

	protected Reader(String name, int number, String faculty, String dateOfBirth, String phone) {
		this.name = name;
		this.number = number;
		this.faculty = faculty;
		this.dateOfBirth = dateOfBirth;
		this.phone = phone;
	}

	protected void takeBook(int quantity) {
		System.out.println(name + " взял " + quantity + " книги");
	}

	protected void takeBook(String... books) {
		System.out.println(name + " взял книги: ");
		for (String book : books) {
			System.out.print(book + " \n");
		}
	}

	protected void takeBook(Book... namesOfBooks) {
		System.out.print(name + " взял книги: \n");
		for (Book nameOfBook : namesOfBooks) {
			System.out.println(nameOfBook.author + " " + nameOfBook.title  + " ");
		}
	}


	@Override
	public String toString() {
		return "Reader [name=" + name + ", number=" + number + ", faculty=" + faculty + ", dateOfBirth=" + dateOfBirth
				+ ", phone=" + phone + "]";
	}

	protected void returnBook(Book... books) {
		System.out.println(name + " вернул " + books.length + " книги");
		System.out.println(name + " вернул книги: ");
		for (Book nameOfBook : books) {
		System.out.println(nameOfBook.author + " " + nameOfBook.title );
		}
	}
}