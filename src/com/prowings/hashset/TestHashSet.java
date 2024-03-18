package com.prowings.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {
	
	public static void main(String[] args) {
		
		HashSet<String>hs =  new HashSet<String>();
		
		hs.add("Shubham");
		hs.add("hello");
		hs.add("Ea");
		hs.add("hii");
		hs.add("abc");
		hs.add("Shubham");
		hs.add("FB");
		
		
//		System.out.println(hs.contains("hello"));
		
//		System.out.println(hs.remove("hello"));
		
//		hs.clear();
		
//		for(String i : hs)
//		{
//			System.out.println(i);
//		}
		
		Iterator itr = hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println(hs);
	}

}
