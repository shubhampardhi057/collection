package com.prowings.vector;

import java.util.Arrays;
import java.util.Vector;

public class TestVectorMethod {
	
	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.addElement("Shubham");
		v.addElement(50);
		v.addElement(50.5);
		v.addElement("Pardhi");
		
	
		System.out.println("Vector : "+v);
		
		System.out.println(v.elementAt(2));
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		
		v.setElementAt("AAA",1);
		
		System.out.println("after set elements :"+ v);
		
		v.removeElement("AAA");
		
		System.out.println("after remove elements :"+ v);
		
		v.insertElementAt("BBB",1);
		
		System.out.println("after insert elements :"+ v);
		
		v.removeElement("BBB");
		
		System.out.println("after remove elements :"+ v);
		
		
	
		Object [] myarr =  new Object[v.size()];
		
		v.copyInto(myarr);
		
		System.out.println("My array :"+ Arrays.toString(myarr));
		
		
		v.ensureCapacity(10);
		
		System.out.println("ensure capacity :"+ v);
		
		v.trimToSize();
		
		System.out.println("after trimtosize :"+ v);
		
		v.setSize(5);
		
		System.out.println("after set size :"+ v);
		
		
		System.out.println(v.capacity());
		
		System.out.println(v.size());
		
		System.out.println(v.isEmpty());
		
		System.out.println(v.indexOf("Pardhi"));
		
		System.out.println(v.lastIndexOf("Shubham"));
		
		System.out.println(v.lastIndexOf("Pardhi",2));
	}

}
