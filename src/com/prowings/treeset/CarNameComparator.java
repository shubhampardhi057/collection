package com.prowings.treeset;

import java.util.Comparator;

public class CarNameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		Car car1 = (Car)o1;
		
		Car car2 = (Car)o2;
		
		
		int res = car1.name.compareTo(car2.name);
		
		
		return res;		
		
		
		
	}
	
	
	
	
	
	
	

}
