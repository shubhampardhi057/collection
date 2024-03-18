package com.prowings.arraylist;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class TestArrayListTrimToSizeMethod {
	
	public static void main(String[] args) throws Exception {
		
		
		
		ArrayList al = new ArrayList();
		
		al.add("hello");
		al.add(20);
		al.add("hi");
		al.add(10);
		al.add(30);
		
		System.out.println("initial capacity : "+getCapacity(al));
		System.out.println("size : "+al.size());

		System.out.println(al);
		
		
		al.trimToSize();
		
		System.out.println(">>>>>>>after trimming AL<<<<<<<<<");
		System.out.println("initial capacity : "+getCapacity(al));
		System.out.println("size : "+al.size());

		
	}

	
    public static int getCapacity(ArrayList<?> l) throws Exception {
        Field dataField = ArrayList.class.getDeclaredField("elementData");
        dataField.setAccessible(true);
        return ((Object[]) dataField.get(l)).length;
    
	}

}
