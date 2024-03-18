package com.prowings.generics;

import java.util.ArrayList;

public class TestGenerics2 {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList<>();
		
		
		al.add("AAA");
		al.add("BBB");
//		al.add(1234);
		
		
		
//		String s = (String) al.get(2);
		
		
		ArrayList<String> al2 = new ArrayList<>();
		
		al.add("AAA");
		al.add("AAA");
		al.add("AAA");

		
		String s1 = al2.get(0);
		
		System.out.println(al2);
		
		
		
		
		
		
		
		
		
		
		
	}

}
