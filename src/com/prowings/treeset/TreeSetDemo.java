package com.prowings.treeset;

import java.util.TreeSet;

public class TreeSetDemo {
	
	
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		
		ts.add("AAA");
		ts.add("BBB");
		ts.add("CCC");
		ts.add("DDD");
		ts.add("AAA");
		
		
		System.out.println(ts);
		
	}

}
