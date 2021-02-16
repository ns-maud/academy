package by.academy.tasks.interfaceEnum.task2;

public class InstrumentDemo {

	public static void main(String[] args) {

		Instrument [] instruments = new Instrument [5];
		
		instruments[0] = new Drum (5.4);
		instruments[1] = new Drum (4.0);
		
		instruments[2] = new Guitar (4);
		
		instruments[3] = new Trumpet (5.4);
		instruments[4]= new Trumpet (0.5);
		
		for (Instrument inst : instruments) {
			inst.play();
		}
	}
	

	
}
