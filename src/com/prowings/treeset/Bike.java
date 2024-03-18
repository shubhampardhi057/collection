package com.prowings.treeset;

public class Bike implements Comparable {
	
	int model;
	String name;
	
	public Bike() {
		
		super();
	}

	
	public Bike(int model,String name) {
		
		super();
		
		this.model = model;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Bike [model=" + model + ", name=" + name + "]";
	}


	@Override
	public int compareTo(Object o) {
		
		Bike b1 = (Bike)o;
		
		
		if(this.model == b1.model)
			return 0;
		else if(this.model > b1.model)
			return 1;
		else
			return -1;
		
	}
	
	
	
	
	
	
}
