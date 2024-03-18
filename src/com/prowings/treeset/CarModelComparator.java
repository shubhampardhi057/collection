package com.prowings.treeset;

import java.util.Comparator;

public class CarModelComparator  implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		Car car1 = (Car)o1;
		
		Car car2 = (Car)o2;
		
		if(car1.model == car2.model)
			return 0;
		else if(car1.model > car2.model)
			return 1;
		else
			return -1;
		
		
	}
	
	
	
	
	

}
