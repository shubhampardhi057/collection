package com.prowings.treeset;

import java.util.TreeSet;

public class BikeComparableDemoUsingName {
	
	public static void main(String[] args) {
		
		Bike2 b1 = new Bike2(2023,"Activa");
		Bike2 b2 = new Bike2(2020,"Divo");
		Bike2 b3 = new Bike2(2022,"Nitroq");
		
		
		
		
		TreeSet ts = new TreeSet();
		
		
		ts.add(b3);
		ts.add(b1);
		ts.add(b2);
		
		
		System.out.println(ts);
		
		
		
	}

}
