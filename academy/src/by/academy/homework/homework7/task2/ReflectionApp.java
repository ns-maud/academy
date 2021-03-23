package by.academy.homework.homework7.task2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionApp {

	public static void main(String[] args) {
		User user = new User("Глеб", "Иванов", 11, "12.12.2010", "Gleb", "123456", "gleb2010@gmail.com");
		Class<User> userClass = User.class;
		Class<? super User> personClass = userClass.getSuperclass();
		try {
			System.out.println("Вывод с помощью getMethod");
			Method userMethod = userClass.getMethod("getAge");
			System.out.println("Method name: " + userMethod.getName());
			System.out.println();

		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

		System.out.println("Вывод с помощью getMethods");
		Method[] userMethods = userClass.getMethods();
		for (Method method : userMethods) {
			System.out.println(method);
		}
		System.out.println();

		System.out.println("Вывод с помощью getField");
		try {
			Field userField = userClass.getField("password");
			System.out.println(userField);
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
		System.out.println();

		System.out.println("Вывод с помощью getFields");
		Field[] userFields = userClass.getFields();
		for (Field field : userFields) {
			System.out.println(field);
		}
		System.out.println();

		try {
			System.out.println("Вывод с помощью getDeclaredMethod");
			Method userDeclaredMethod = userClass.getDeclaredMethod("printUserInfo");
			System.out.println("Method name: " + userDeclaredMethod.getName());
			System.out.println();

		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

		System.out.println("Вывод с помощью getDeclaredMethods");
		Method[] userDeclaredMethods = userClass.getDeclaredMethods();
		for (Method declaredMethod : userDeclaredMethods) {
			System.out.println(declaredMethod);
		}
		System.out.println();

		System.out.println("Вывод с помощью getDeclaredField");
		try {
			Field userDeclaredField = userClass.getDeclaredField("login");
			System.out.println(userDeclaredField);
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
		System.out.println();

		System.out.println("Вывод с помощью getDeclaredFields");
		Field[] userDeclaredFields = userClass.getDeclaredFields();
		for (Field declaredField : userDeclaredFields) {
			System.out.println(declaredField);
		}
		System.out.println();

		try {

			Field fieldFirstName = personClass.getDeclaredField("firstName");
			fieldFirstName.setAccessible(true);
			fieldFirstName.set(user, "Глебушка");

			Field fieldLastName = personClass.getDeclaredField("lastName");
			fieldLastName.setAccessible(true);
			fieldLastName.set(user, "ИвановУжеНеТот");

			Field fieldLastAge = personClass.getDeclaredField("age");
			fieldLastAge.setAccessible(true);
			fieldLastAge.set(user, 21);

			Field fieldDateOfBirth = personClass.getDeclaredField("dateOfBirth");
			fieldDateOfBirth.setAccessible(true);
			fieldDateOfBirth.set(user, "12.12.2000");

			Field fieldLogin = userClass.getDeclaredField("login");
			fieldLogin.setAccessible(true);
			fieldLogin.set(user, "Hleb");

			Field fieldPassword = userClass.getDeclaredField("password");
			fieldPassword.setAccessible(true);
			fieldPassword.set(user, "654321");

			Field fieldEmail = userClass.getDeclaredField("email");
			fieldEmail.setAccessible(true);
			fieldEmail.set(user, "hleb2010@gmail.com");

		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

		try {
			Method getMethod = userClass.getDeclaredMethod("printUserInfo");
			getMethod.setAccessible(true);
			getMethod.invoke(user);

		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
