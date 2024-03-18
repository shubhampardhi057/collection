package com.prowings.treeset;

public class Employee implements Comparable {
	
	int id;
	String name;
	
	public Employee() {
		super();
	}

	
	public Employee(int id,String name) {
		
		super();
		
		this.id = id;
		this.name = name;
		
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}


	@Override
	public int compareTo(Object o) {  // comparable - by id comparision
		
		Employee emp = (Employee) o;
		
		if(this.id == emp.id)
			return 0;
		else if(this.id > emp.id)
			return 1;
		else
			return -1;
		
		
	}
	
	
}
