package com.prowings.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestVectorCursors {
	
	public static void main(String[] args) {
		
		Vector  v = new Vector();
		
		v.addElement("Shubham");
		v.addElement(50);
		v.addElement(40.5);
		v.addElement("Pardhi");
		
		System.out.println("Vector  :"+v);
		
		iterateUsingIterator(v);
		
		iterateUsingListIterator(v);
		
		iterateUsingEnumeration(v);
		
	}

	private static void iterateUsingEnumeration(Vector v) {
		
		System.out.println("iterate using Enumeration - started");
		
		
		Enumeration e = v.elements();
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		
		System.out.println("iterate using Enumeration - ended");
	}

	private static void iterateUsingListIterator(Vector v) {
		
		System.out.println("iterate using ListIterator - started");
		
		ListIterator  ltr =v.listIterator();
		
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		
		
		System.out.println("iterate using ListIterator - ended");
	}

	private static void iterateUsingIterator(Vector v) {
		
		System.out.println("iterate using Iterator - started");
		
		Iterator  itr = v.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("iterate using Iterator - ended");
	}

}
