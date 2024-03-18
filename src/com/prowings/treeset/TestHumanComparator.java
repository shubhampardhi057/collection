package com.prowings.treeset;

import java.util.TreeSet;

public class TestHumanComparator {
	
	public static void main(String[] args) {
		
		
		Human h1 = new Human(10.0d);
		Human h2 = new Human(7.5d);
		Human h3 = new Human(2.8d);
		
		HumanComparator obj = new HumanComparator();
		
		
		TreeSet ts = new TreeSet(obj);
		
		
		ts.add(h1);
		ts.add(h2);
		ts.add(h3);
		
		System.out.println(ts);
		
	}

}
