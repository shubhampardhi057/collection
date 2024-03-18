package com.prowings.hashset;

import java.util.Objects;

public class Student {
	
	int rollNo;
	String name;
	
	
	public Student()
	{
		super();
	}

	
	public Student(int rollNo , String name)
	{
		super();
		this.rollNo = rollNo;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}


//	@Override
//	public int hashCode() {
//		return Objects.hash(name, rollNo);
//	}


//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		return Objects.equals(name, other.name) && rollNo == other.rollNo;
//	}
	
	
	public int hashCode() {
		
		int res = 0;
		
		res = 31 * (this.rollNo + this.name.hashCode());
		
		return res;
	}
	
	public boolean equals(Object obj) {
		
		Student std4 = (Student) obj;
		
//		boolean res = false;
		
		
		
		if((this.rollNo == std4.rollNo) && (this.name.equals(std4.name)))
			return true;
	
		return false;
		
	}
	
	
}
