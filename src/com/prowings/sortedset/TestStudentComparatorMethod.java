package com.prowings.sortedset;

import java.util.Comparator;
import java.util.TreeSet;

public class TestStudentComparatorMethod {
	
	public static void main(String[] args) {
		
	
	Student s1 = new Student(10, "Ram", 75);
	Student s2 = new Student(02, "AAA", 89);
	Student s3 = new Student(04, "Sham", 39);
	
	
//	TreeSet ts = new TreeSet<>(new StudentRollNoComparator());
//	TreeSet ts = new TreeSet<>(new StudentNameComparator());
	TreeSet ts = new TreeSet<>(new StudentMarksComparator());
	
	
	ts.add(s1);
	ts.add(s2);
	ts.add(s3);
	
	System.out.println(ts);
	

	System.out.println("Highest marks Student :=>>"+ getHighestMarkStudent(ts));
	
	System.out.println("Second Highest marks Student :=>>"+ getSecondHighestMarkStudent(ts));
	
	
	Comparator cmp1 = ts.comparator();
	
	if( cmp1 != null)
		System.out.println(cmp1.getClass().getName()+"=>> Compartor Used");
	else
		System.out.println("Comparable Used");
	
	
	}
	
	
	public static Student getHighestMarkStudent(TreeSet t) {
		
		Comparator cmp = t.comparator();
		
		if( cmp instanceof StudentMarksComparator)
			return (Student) t.last();
		else
			return null;
		
	}
		public static Student getSecondHighestMarkStudent(TreeSet t) {
			
			Comparator cmp = t.comparator();
			
			if( cmp instanceof StudentMarksComparator)
				return (Student)t.lower(t.last());
			else
				return null;
		
		
		
		
		
		
		
	}
}