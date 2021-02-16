package by.academy.tasks.interfaceEnum.task3;

public class FavouriteSeason {

	public static void main(String[] args) {
		
		for (Seasons s : Seasons.values()) {
			System.out.println("Время года: " + s);
			s.getInformation();
			System.out.println("Средняя температура: " + s.getTemperature());
			System.out.println(s.getDescription());
			s.likeSeason(s);
			System.out.println();
		}
	}
}