package com.prowings.sortedset;

public class Student {
	
	int rollno;
	String name;
	int marks;
	
	public Student() {
		super();
	}

	public Student(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	
	

}
