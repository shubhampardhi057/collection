package com.prowings.treeset;

import java.util.TreeSet;

public class TreeSetDemoStudentId {
	
	public static void main(String[] args) {
		
		Student std1 = new Student(1057,"AAA");
		Student std2 = new Student(1039,"RRR");
		Student std3 = new Student(1021,"BBB");
		
		
		TreeSet  ts = new TreeSet();
		
		
		ts.add(std3);
		ts.add(std1);
		ts.add(std2);
		
		
		
		System.out.println(ts);
		
	}

}
