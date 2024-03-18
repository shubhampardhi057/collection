package com.prowings.treeset;

import java.util.TreeSet;

public class TreeSetDemo2 {

	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("AAA");
		StringBuffer sb1 = new StringBuffer("BBB");
		StringBuffer sb2 = new StringBuffer("CCC");
		
		
		TreeSet ts = new TreeSet();
		
		
		ts.add(sb);
		ts.add(sb1);
		ts.add(sb2);
		
		
		System.out.println(ts);
		
	}
}
