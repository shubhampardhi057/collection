package com.prowings.treeset;

import java.util.TreeSet;

public class TreeSetDemoEmployeeName {
	
	public static void main(String[] args) {
		
		Employee2 emp1   = new Employee2(101, "AAA");
		Employee2 emp2   = new Employee2(102, "WWW");
		Employee2 emp3   = new Employee2(103, "QQQ");
		
		
		TreeSet ts = new TreeSet();
		
		ts.add(emp3);
		ts.add(emp1);
		ts.add(emp2);
		
		
		System.out.println(ts);
	}

}
