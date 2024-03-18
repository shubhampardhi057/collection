package com.prowings.hashset;

import java.util.HashSet;

public class HashSet_hashcollision_Demo {
	
	public static void main(String[] args) {
		
		String s= "FB";
		
		String s1 = "Ea";
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		
		
		System.out.println(s.hashCode() == s1.hashCode());
		
		HashSet hs = new HashSet();
		
		hs.add(s);
		hs.add(s1);
		
		
		
		System.out.println(hs);
	}

}
