package com.prowings.treeset;

import java.util.Comparator;

public class PersonIdComparator implements Comparator  {

	@Override
	public int compare(Object o1, Object o2) {
		
		Person prsn1 = (Person)o1;
		
		Person prsn2 = (Person)o2;
		
		if(prsn1.id == prsn2.id)
			return 0;
		else if(prsn1.id > prsn2.id)
			return 1;
		else
			return -1;
				
	}
	
	
	

}
