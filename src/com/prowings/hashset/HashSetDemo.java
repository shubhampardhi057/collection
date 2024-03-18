package com.prowings.hashset;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		
		
		HashSet hs = new HashSet<>();
		
		System.out.println(hs.add("AAA"));
		System.out.println(hs.add("BBB"));
		System.out.println(hs.add("CCC"));
		System.out.println(hs.add("AAA"));
		
		System.out.println(hs);
	}

}
