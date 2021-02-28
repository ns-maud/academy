package by.academy.homework.homework4.task3;
import java.util.Iterator;

public class TwoDimArrayIterator <T> implements Iterator <T> {
	
	private T [][] twoDimArray;
	private int indexRow = 0;
	private int indexColumn = 0;
	
	public TwoDimArrayIterator (T [][] twoDimArray) {
		super ();
		this.twoDimArray = twoDimArray;
	}

	@Override
	public boolean hasNext() {
		if (twoDimArray == null ||  indexRow >= twoDimArray.length || indexColumn >= twoDimArray [indexRow].length) {
			return false;
		}
		return twoDimArray [indexRow][indexColumn] != null;
	}

	@Override
	public T next() {
		T element = twoDimArray [indexRow][indexColumn++];
		if (indexColumn >= twoDimArray[indexRow].length) {
			indexRow++;
			indexColumn = 0;
		  }
		  return element;
		 
	}

	public T[][] getTwoDimArray() {
		return twoDimArray;
	}

	public void setTwoDimArray(T[][] twoDimArray) {
		this.twoDimArray = twoDimArray;
	}
}
