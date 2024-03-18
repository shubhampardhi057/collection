package com.prowings.hashset;

import java.util.HashSet;

public class HashSet_LoadFactor_ResizingDemo {
	
	public static void main(String[] args) {
		
		
		String s1 = "FB";
		String s2 = "Ea";
		String s3 = "AAA";
		String s4 = "BBB";
		String s5 = "CCC";
		String s6 = "DDD";
		String s7 = "EEE";
		String s8 = "FFF";
		String s9 = "GGG";
		String s10 = "HHH";
		String s11 = "JJJ";
		String s12 = "KKK";
		String s13 = "SSS";
		
		
		HashSet hs = new HashSet();
		
		System.out.println(hs.add(s1));
		System.out.println(hs.add(s2));
		System.out.println(hs.add(s3));
		System.out.println(hs.add(s4));
		System.out.println(hs.add(s5));
		System.out.println(hs.add(s6));
		System.out.println(hs.add(s7));
		System.out.println(hs.add(s8));
		System.out.println(hs.add(s9));
		System.out.println(hs.add(s10));
		System.out.println(hs.add(s11));
		System.out.println(hs.add(s12));
		System.out.println(hs.add(s13));
		
		
		System.out.println(hs);
		
		
	}

}
