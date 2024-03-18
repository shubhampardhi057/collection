package com.prowings.treeset;

public class Vehicle {


	int model;
	String name;
	
	
	public Vehicle() {
		
		super();
	}
	
	public Vehicle(int model,String name) {
		
		super();
		
		this.model = model;
		this.name = name;
		
	}

	@Override
	public String toString() {
		return "Vehicle [model=" + model + ", name=" + name + "]";
	}
	
	
	
	
}
