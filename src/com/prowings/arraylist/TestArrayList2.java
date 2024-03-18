package com.prowings.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList2 {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("Shubham");
		al.add("Pardhi");
		al.add("abhi");
		al.add(10);
		al.add(50);
		al.add("hii");
		al.add("hello");
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext())
		{
				
			Object elements = itr.next();
						
			System.out.println(elements);
			
			if(elements.equals("hii"))
				al.set(6,"Shubham");
			
//			System.out.println(itr.next());
			
//			al.remove(1);
//			al.add("world");
			
//			if(itr.next().equals("hii"))
//				itr.remove();
			
		}
		
		System.out.println(al);
	}

}
