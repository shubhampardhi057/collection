package com.prowings.treeset;

import java.util.TreeSet;

public class PersonDemoUsingComparator {
	
	public static void main(String[] args) {
		
		Person p1 = new Person(101,"Ram");
		Person p2 = new Person(103,"Sham");
		Person p3 = new Person(102,"WWW");
		
		
		
//		PersonIdComparator obj = new PersonIdComparator();
		
		PersonNameComparator obj1 = new PersonNameComparator();
		
		
		TreeSet ts = new TreeSet(obj1);
		
		ts.add(p1);
		ts.add(p3);
		ts.add(p2);
		
		
		System.out.println(ts);
		
		
		
		
		
		
	}

}
