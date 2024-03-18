package com.prowings.sortedset;

import java.util.Comparator;

public class StudentRollNoComparator implements Comparator<Student> {

	@Override
	public int compare(Student std1, Student std2) {
		
		if( std1.rollno > std2.rollno)
			return 1;
		else if( std1.rollno < std2.rollno)
			return -1;
		else
			return 0;
		
	}

}
		
		
		
		
		
		
		
		
		
		
	
	
	
	


