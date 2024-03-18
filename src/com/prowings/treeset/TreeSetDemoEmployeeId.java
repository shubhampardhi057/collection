package com.prowings.treeset;

import java.util.TreeSet;

public class TreeSetDemoEmployeeId {
	
	public static void main(String[] args) {
		
		Employee emp1  = new Employee(20,"Ram");
		Employee emp2  = new Employee(10,"Sham");
		Employee emp3  = new Employee(5,"WWW");
		
		
		TreeSet ts = new TreeSet(); //  sort Emp by id
		
		
		ts.add(emp3);
		ts.add(emp2);
		ts.add(emp1);
		
		
		System.out.println(ts);
		
	}

}
