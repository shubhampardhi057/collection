package com.prowings.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestArrayList5 {
	
	public static void main(String[] args) {
		
		

		ArrayList al = new ArrayList();
		
		al.add("abc");
		al.add("pqr");
		al.add("xyz");
		al.add("jkl");
		al.add("gfh");
		al.add("def");
		
		
		
		ListIterator ltr = al.listIterator();
		
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
			
//			if(ltr.next().equals("jkl"))
//				al.set(2,"hiiiiiiiiii");
//			
				
			
//			 al.add("rrr");
		}
		
		System.out.println(al);
		
		
		
		
		
		
		
		
		
	}

}
