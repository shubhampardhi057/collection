package com.prowings.treeset;

import java.util.TreeSet;

public class CarDemoUsingComparator {
	
	public static void main(String[] args) {
		
		
		Car c1 = new Car(2021, "Tata");
		Car c2 = new Car(2023, "Mahindra");
		Car c3 = new Car(2022, "TOYOTA");
		
		
//		CarModelComparator obj  = new CarModelComparator();
		
		CarNameComparator obj1 = new CarNameComparator();
		
		
		TreeSet ts = new TreeSet(obj1);
		
		ts.add(c3);
		ts.add(c1);
		ts.add(c2);
		
		
		System.out.println(ts);
		
		
		
		
		
		
		
		
		
		
		
	}

}
