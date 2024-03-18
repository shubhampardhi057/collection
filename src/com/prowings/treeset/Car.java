package com.prowings.treeset;

public class Car {
	
	int model;
	String name;
	
	
	public Car() {
		
		super();
	}

	public Car(int model , String name) {
		
		super();
		
		this.model = model;
		
		this.name = name;
		
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", name=" + name + "]";
	}
	
	
	
}
