package by.academy.tasks.interfaceEnum.task2;

public class Drum implements Instrument {

	private double size;
	
	protected Drum (double size) {
		this.size = size;
	}
	
	@Override
	public void play() {
		System.out.println("Играет барабан " + "с размером " + size );
	}

}
