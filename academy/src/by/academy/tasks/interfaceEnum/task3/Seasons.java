package by.academy.tasks.interfaceEnum.task3;

public enum Seasons {

	WINTER("December", "January", "February", -10), 
	SPRING("March", "April", "May", 17),
	SUMMER("June", "July", "August", 25) {
		@Override
		public String getDescription() {
			return "Теплое время года";
		}
	},
	AUTUMN("September", "October", "November", 10);

	private String firstMounth;
	private String secondMounth;
	private String thirdMounth;
	private int temperature;

	Seasons(String firstMounth, String secondMounth, String thirdMounth, int temperature) {
		this.firstMounth = firstMounth;
		this.secondMounth = secondMounth;
		this.thirdMounth = thirdMounth;
		this.temperature = temperature;
	}

	public String getFirstMounth() {
		return firstMounth;
	}

	public String getSecondMounth() {
		return secondMounth;
	}

	public String getThirdMounth() {
		return thirdMounth;
	}

	public int getTemperature() {
		return temperature;
	}

	public void getInformation() {
		System.out.println(getFirstMounth());
		System.out.println(getSecondMounth());
		System.out.println(getThirdMounth());
	}

	public void likeSeason(Seasons season) {
		switch (season) {
		case WINTER:
			System.out.println("Слишком холодно");
			break;
		case SPRING:
			System.out.println("Я люблю весну!");
			break;
		case SUMMER:
			System.out.println("Слишком жарко");
			break;
		case AUTUMN:
			System.out.println("Слишком дождливо");
			break;
		default:
			System.out.println("Такой поры года нет");
		}
	}

	public String getDescription() {
		return "Холодное время года";
	}
}
