package com.prowings.vector;

import java.util.Vector;

public class TestVectorConstructor {
	
	public static void main(String[] args) {
		
//		Vector v = new Vector();     //no-arg constuctor with capacity of 10
		
		
		
//		Vector v = new Vector(20);   // 1-arg constuctor with specified capacity 
		
		
		Vector v = new Vector(5,10);//1- arg constuctor with the specified initial capacity and capacity increment.
		
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(10);
		
		
		System.out.println("Size :"+ v.size());
		
		System.out.println("capacity : "+v.capacity());
		
		
		System.out.println(v);
		
	}

}
