package com.prowings.treeset;

import java.util.Comparator;

public class HumanComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		Human h1 = (Human)o1;
		Human h2 = (Human)o2;
		
		if(h1.height == h2.height)
			return 0;
		else if(h1.height > h2.height)
			return 1;
		else 
			return -1;
		
	}
	
	
	
	
	

}
