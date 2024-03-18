package com.prowings.stack;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class TestStackCursors {
	public static void main(String[] args) {
		
		Stack stack = new Stack();
		
		stack.add("Shubham");
		stack.add("hello");
		stack.add(50);
		stack.add('A');
		
		Iterator itr = stack.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
//		ListIterator ltr =stack.listIterator();
//		while(ltr.hasNext());
//		{
//			System.out.println(ltr.next());
//		}
		
		Enumeration e = stack.elements();
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}

}
