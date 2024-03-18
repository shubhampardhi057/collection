package com.prowings.sortedset;

import java.util.Comparator;
import java.util.TreeSet;

public class SortedSetMethods {
	
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet<>();
		
		
		ts.add(30);
		ts.add(10);
		ts.add(60);
		ts.add(40);
		ts.add(20);
		ts.add(50);
		
		System.out.println(ts);
		
		System.out.println(ts.first());
		
		System.out.println(ts.last());
		
		TreeSet ts1 = (TreeSet) ts.headSet(30);
		
		System.out.println(">>>HeadSet>>>"+ ts1);
		
		TreeSet ts2 = (TreeSet) ts.tailSet(30);
		
		System.out.println(">>>TailSet>>>"+ ts2);
		
		
		TreeSet ts3 = (TreeSet) ts.subSet(20,50);
		
		System.out.println(">>>SubSet>>>"+ ts3);
		
		
		Comparator cmp = ts.comparator();
		
		if( cmp != null)
			System.out.println(cmp.getClass().getName()+"Comparator Used");
		else
			System.out.println("Comparable Used");
			
		
		
		
		
		
		
		
	}

}
