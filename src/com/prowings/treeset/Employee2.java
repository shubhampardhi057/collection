package com.prowings.treeset;

public class Employee2 implements Comparable  {
	

	int id;
	String name;
	
	public Employee2() {
		
		super();
		
	}

	public Employee2(int id , String name) {
		
		super();
		
		this.id = id;
		this.name = name;
		
	}

	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Object o) {
		
		Employee2 emp2 = (Employee2) o;
		
		int res = this.name.compareTo(emp2.name);
		
		
		return res;
	}
	
	
}
