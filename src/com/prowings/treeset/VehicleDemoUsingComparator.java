package com.prowings.treeset;

import java.util.TreeSet;

public class VehicleDemoUsingComparator {
	
	public static void main(String[] args) {
		
		
		Vehicle vh1 = new Vehicle(2023,"Virtus");
		Vehicle vh2 = new Vehicle(2021,"Fortuner");
		Vehicle vh3 = new Vehicle(2022,"Thar");
		
		
		VehicleModelComparator obj = new VehicleModelComparator();
		
		VehicleNameComparator obj1 = new VehicleNameComparator();
		
		
		TreeSet ts = new TreeSet(obj1);
		
		
		ts.add(vh2);
		ts.add(vh1);
		ts.add(vh3);
		
		
		System.out.println(ts);
		
		
		
		
		
	}

}
