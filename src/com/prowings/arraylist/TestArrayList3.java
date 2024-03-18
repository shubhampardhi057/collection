package com.prowings.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class TestArrayList3 {
	
	public static void main(String[] args) {
		
		
		ArrayList al = new ArrayList();
		
		al.add("hello");
		al.add(20);
		al.add("hii");
		al.add(40);
		al.add("hii");
		al.add("hello");
		
		
		Object [] myarr = al.toArray();
		
		System.out.println(Arrays.toString(myarr));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


	
}
