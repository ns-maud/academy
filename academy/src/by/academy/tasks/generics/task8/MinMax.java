package by.academy.tasks.generics.task8;

public class MinMax <M extends Number> {

	private M[] array;
	int minIndex = 0;
	int maxIndex = 0;

	public MinMax(M[] array) {
		this.array = array;
	}

	public void getMinMaxValue() {
		for (int i = 0; i < array.length; i++) {
			double minValue = array[0].doubleValue();
			double maxValue = array[0].doubleValue();
			if (minValue > array[i].doubleValue()) {
				minIndex = i;
			}
			if (maxValue < array[i].doubleValue()) {
				maxIndex = i;
			}
		}
		System.out.println("Минимальное значение = " + array [minIndex]);
		System.out.println("Максимальное значение = " + array [maxIndex]);
	}
}
