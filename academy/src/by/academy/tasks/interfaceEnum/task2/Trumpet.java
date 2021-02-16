package by.academy.tasks.interfaceEnum.task2;

public class Trumpet implements Instrument {

	private double diameter;
	
	
	protected Trumpet (double diameter) {
		this.diameter = diameter;
	}
	
	@Override
	public void play() {	
		System.out.println("Играет труба " + "с диаметром " + diameter);
	}
	
	
}
