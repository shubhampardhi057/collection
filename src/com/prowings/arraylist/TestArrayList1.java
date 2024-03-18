package com.prowings.arraylist;

import java.util.ArrayList;

public class TestArrayList1 {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
	
	
		al.add("hello");
		al.add("hii");
		al.add(10);

		ArrayList al2 = new ArrayList();
		
		
		al2.add("hello");
		al2.add("hii");
		al2.add(10);
		al2.add(20);
				
		
		ArrayList al3 = new ArrayList();
		
		al3.addAll(al2);
		
//		al3.remove(0);

//		al2.removeAll(al);
		
//		System.out.println(al3.contains(20));
//		System.out.println(al3.containsAll(al2));
		
//		al2.retainAll(al);
		
//		System.out.println(al3.isEmpty());
//		System.out.println(al3.size());
		
//		al2.clear();
		
		
//		System.out.println(al2.hashCode());
//		System.out.println(al2.equals(al3));
		
		
		
		
//		al3.iterator();
//		al3.toArray();
		
		
		
		
		
		
		
		
		
		System.out.println(al3);
		System.out.println(al2);
		System.out.println(al);
		
		
		
	
	
	
	}
	

}
