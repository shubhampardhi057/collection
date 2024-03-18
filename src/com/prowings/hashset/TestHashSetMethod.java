package com.prowings.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class TestHashSetMethod {
	
	public static void main(String[] args) {
		
		
		ArrayList al = new ArrayList();
		
		al.add("shubham");
		al.add(10);
		al.add('Z');
		
		 
		HashSet hs = new HashSet(al);
		
		hs.add("AAA");
		hs.add("BBB");
		hs.add("CCC");
		hs.add("DDD");
		
		
//		hs.remove("CCC");
		
//		hs.removeAll(hs);
	
		System.out.println(hs.contains("AAA"));
		
		System.out.println(hs.containsAll(hs));
		
//		hs.retainAll(al);
		
//		hs.clear();
		
		System.out.println(hs.isEmpty());
		
		System.out.println(hs.size());
		
		System.out.println(hs.equals(al));
		
		System.out.println(hs.hashCode());
		
		Iterator itr = hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
//		System.out.println(hs.toString());
		
		System.out.println(hs.toArray());
		
		System.out.println(hs);
		
		
		
	}

}
