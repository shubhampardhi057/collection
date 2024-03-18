package com.prowings.treeset;

import java.util.Comparator;

public class VehicleNameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		Vehicle v1 = (Vehicle)o1;
		Vehicle v2 = (Vehicle)o2;
		
		int res = v1.name.compareTo(v2.name);
		
		return res;
	}
	
	
	

}
