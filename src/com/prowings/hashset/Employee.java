package com.prowings.hashset;

public class Employee {
	
	int id ;
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

	public int hashCode() {
		
		int res = 0;
		
		res = 31 * (this.id + this.name.hashCode());
		
		return res;
	}
	

	public boolean equals(Object obj) {
		
		Employee emp = (Employee) obj;
		
		if( (this.id == emp.id) && (this.name.equals(emp.name)) )
			return true;
		return false;
		
		
		
	}
	

}
