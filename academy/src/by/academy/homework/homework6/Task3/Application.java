package by.academy.homework.homework6.Task3;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		List<User> arrayList = new ArrayList<User>();
		arrayList.add(new User("name1", "surname1", 1));
		arrayList.add(new User("name2", "surname2", 2));
		arrayList.add(new User("name3", "surname3", 3));
		arrayList.add(new User("name4", "surname4", 4));
		arrayList.add(new User("name5", "surname5", 5));
		arrayList.add(new User("name6", "surname6", 6));
		arrayList.add(new User("name7", "surname7", 7));
		arrayList.add(new User("name8", "surname8", 8));
		arrayList.add(new User("name9", "surname9", 9));
		arrayList.add(new User("name10", "surname10", 10));

		File catalog = new File("src\\by\\academy\\homework\\homework6\\Task3\\Users");
		if (catalog.mkdirs() && arrayList != null) {
			for (User user : arrayList) {
				File file = new File(catalog, user.getName() + "_" + user.getSurname() + ".txt");
				try (ObjectOutputStream oos = new ObjectOutputStream(
						new BufferedOutputStream(new FileOutputStream(file)))) {
					oos.writeObject(user.toString());
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
