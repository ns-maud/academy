package by.academy.classwork.lesson9;

public class Guitar implements Instrument{

	private int amountOfStrings;
	
	protected Guitar (int amountOfStrings) {
		this.amountOfStrings = amountOfStrings;
	}

	@Override
	public void play() {
		System.out.println("Играет гитара " + "с количеством струн " + amountOfStrings);
		
	}

}
