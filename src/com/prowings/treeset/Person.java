package com.prowings.treeset;

public class Person {
	
	int id;
	String name;
	
	public Person() {
		
		super();
	}
	
	public Person(int id,String name) {
		
		super();
		
		this.id = id;
		this.name = name;
		
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	
	
}
