package com.prowings.arraylist;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class TestArrayList {
	
	public static void main(String[] args) throws Exception {
		
		
		ArrayList al = new ArrayList();
		
		al.add("hello");
		al.add("hii");
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		
		System.out.println(al);
		
		System.out.println("ArrayList size:- "+    al.size());
		
		System.out.println("Initial capacity :-" + getCapacity(al));
		
		
		
		
		
	}
	 public static int getCapacity(ArrayList<?> l) throws Exception {
	        Field dataField = ArrayList.class.getDeclaredField("elementData");
	        dataField.setAccessible(true);
	        return ((Object[]) dataField.get(l)).length;
	 }

}
