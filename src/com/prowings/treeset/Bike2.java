package com.prowings.treeset;

public class Bike2 implements Comparable {
	
	int model;
	String name;
	
	
	public Bike2() {
		super();
	}


	public Bike2(int model, String name) {
		super();
		this.model = model;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Bike2 [model=" + model + ", name=" + name + "]";
	}


	@Override
	public int compareTo(Object o) {
		
		Bike2 b1 =  (Bike2)o;
		
		int res = this.name.compareTo(b1.name);
		
		return res;
		
		
		
		
	}
	
	

}
