package com.prowings.treeset;

import java.util.Comparator;

public class VehicleModelComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		Vehicle v1 = (Vehicle)o1;
		Vehicle v2 = (Vehicle)o2;
		
		if(v1.model == v2.model)
			return 0;
		else if(v1.model > v2.model)
			return 1;
		else
			return -1;
		
		
	}
	
	
	

}
