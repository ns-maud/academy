package by.academy.classwork.lesson9;

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
