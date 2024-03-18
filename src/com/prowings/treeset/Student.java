package com.prowings.treeset;

public class Student implements Comparable  {
	
	int id;
	String name;
	
	public Student() {
		
		super();
	}

	
	public Student(int id ,String name) {
		
		super();
		
		this.id = id;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}


	@Override
	public int compareTo(Object o) {
		
		Student std = (Student)o;
		
		if(this.id == std.id)
			return 0;
		else if(this.id > std.id)
			return 1;
		else
			return -1;
		
	}
	
	
	
}
