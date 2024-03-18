package com.prowings.arraylist;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class TestArrayListConstructors {
	
	public static void main(String[] args) throws Exception {
		
		
//		ArrayList  al = new ArrayList();//  no-arg Constuctor  -- creates 10 capacity arraylist
		
		
		ArrayList al = new ArrayList(10);  // 1 -arg Constuctor -- creates array with Specified arraylist
		
		
		
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		al.add(10);
		
		
		System.out.println(al);
		
		System.out.println("Size :"+ al.size());
		
		
		System.out.println("Intial Capacity :" + getCapacity(al));
		
		ArrayList al2 = new ArrayList(al);// 1- arg Constuctor -- which accepts Another collection 
		
//		al2.addAll(al);
//		al2.add("Hello");
		
		System.out.println("Al2 :"+ al2);
		
		
      ArrayList al3 = new ArrayList(al); //1 arg constructor which accepts another collection
		
//		ArrayList al2 = new ArrayList(20);
		
		al3.addAll(al);
		
		System.out.println("AL2 : "+al2);
//		al2.add(123);
		System.out.println("initial capacity : "+getCapacity(al3));
		System.out.println("size : "+al2.size());
		
		
	}	
	
	

	 public static int getCapacity(ArrayList<?> l) throws Exception {
	        Field dataField = ArrayList.class.getDeclaredField("elementData");
	        dataField.setAccessible(true);
	        return ((Object[]) dataField.get(l)).length;
	    }
	 
}
