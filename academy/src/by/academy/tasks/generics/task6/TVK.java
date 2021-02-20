package by.academy.tasks.generics.task6;

import java.io.Serializable;

public class TVK <T extends Comparable<?>, V extends Animal & Serializable, K extends Number >{

	private T t;
	private V v;
	private K k;
	
	public TVK (T t, V v, K k) {
		this.t = t;
		this.v = v; 
		this.k = k;
	}
	
	public void getClassName (T t) {
		System.out.println(t.getClass());
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public V getV() {
		return v;
	}

	public void setV(V v) {
		this.v = v;
	}

	public K getK() {
		return k;
	}

	public void setK(K k) {
		this.k = k;
	}
	
	
}
