package com.prowings.treeset;

public class Student2 implements Comparable  {

	int id;
	String name;
	
	
	public Student2() {
		
		super();
	}

	
	public Student2(int id , String name) {
		
		super();
		
		this.id = id;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student2 [id=" + id + ", name=" + name + "]";
	}


	@Override
	public int compareTo(Object o) {
		
		Student2 std = (Student2)o;
		
		int res = this.name.compareTo(std.name);
		
		return res;
		
		
	}
	
	
	
}
