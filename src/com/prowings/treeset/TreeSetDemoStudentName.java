package com.prowings.treeset;

import java.util.TreeSet;

public class TreeSetDemoStudentName {
	
	public static void main(String[] args) {
		
		Student2 std1 = new Student2(1011,"Ram");
		Student2 std2 = new Student2(1056,"Sham");
		Student2 std3 = new Student2(1017,"Dham");
		
		
		TreeSet ts = new TreeSet();
		
		ts.add(std3);
		ts.add(std1);	
		ts.add(std2);
		
		
		System.out.println(ts);
		
	}

}
