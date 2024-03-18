package com.prowings.treeset;

import java.util.Comparator;

public class PersonNameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		Person prsn1 = (Person)o1;
		Person prsn2 = (Person)o2;
		
		int res = prsn1.name.compareTo(prsn2.name);
		
		return res;
	}
	
	
	

}
