package com.prowings.hashset;

import java.util.HashSet;

public class TestHashSet_Employee {
	
	public static void main(String[] args) {
		
		
		Employee emp1 = new Employee(101,"Shubham");
		Employee emp2 = new Employee(102,"Pardhi");
		Employee emp3 = new Employee(101,"Shubham");
		
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp3.hashCode());
		
		
		HashSet hs = new HashSet();
		
		hs.add(emp1);
		hs.add(emp2);
		hs.add(emp3);
		
		
		System.out.println(hs);
	}

}
