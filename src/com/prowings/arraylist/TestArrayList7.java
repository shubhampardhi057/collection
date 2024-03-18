package com.prowings.arraylist;

import java.util.ArrayList;

public class TestArrayList7 {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("hello");
		al.add("hii");
		al.add(20);
		
		ArrayList al2 = new ArrayList();
		
		al2.add("world");
		al2.add("abc");
		al2.add(40);
		
		
		ArrayList al3 = new ArrayList();
		
		
		
		
		ArrayList al4 = new ArrayList();
		
		al4.add(al);
		al4.add(al2);
		al4.add(al3);
		
		
		
		
//		al4.remove(al);
		
//		al4.remove(al3);
		
//		al4.remove(al2);
		
//		System.out.println(al4.indexOf(al3));
		
		System.out.println(al4.subList(0,2));
		
		
		System.out.println(al);
		System.out.println(al2);
		System.out.println(al3);
		System.out.println(al4);
		
	
	}

}
