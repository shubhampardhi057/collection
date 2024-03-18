package com.prowings.vector;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class TestVectorConstructor1 {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("AAA");
		al.add("BBB");
		al.add("CCC");
		
		LinkedList ll = new LinkedList();
		
		ll.add("PQR");
		ll.add("JKL");
		ll.add("XYZ");
		
		
		Vector v = new Vector<>(ll); //  1st-arg Constuctor i.e Conversion Constructor
		
		v.add(al);
		
		
		
		System.out.println(v);
		
		
	}

}
