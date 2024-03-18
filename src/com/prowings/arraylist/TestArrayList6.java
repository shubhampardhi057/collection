package com.prowings.arraylist;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList6 {
	
	public static void main(String[] args) {
		
        ArrayList al = new ArrayList();
		
		al.add("hello");
		al.add(20);
		al.add("hi");
		al.add(40);
		al.add("hi");
		al.add("world");
		
		
		List al2 = al.subList(0,5);
//		List al2 = new ArrayList(al.subList(0,5));
		
		
		System.out.println(al2);
		
		
		al.set(2,"abc");
		
		System.out.println(al2);
		System.out.println(al);
		
		
		
		
		
	}

}
