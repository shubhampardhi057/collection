package com.prowings.treeset;

import java.util.TreeSet;

public class BikeComparableDemoUsingModel {
	
	public static void main(String[] args) {
		
		Bike b1 = new Bike(2023, "Honda");
		Bike b2 = new Bike(2020, "Cbz");
		Bike b3 = new Bike(2021, "Fzs");
		
		
		
		
		TreeSet ts = new TreeSet();
		
		ts.add(b1);
		ts.add(b3);
		ts.add(b2);
		
	
		
		System.out.println(ts);
	}

}
