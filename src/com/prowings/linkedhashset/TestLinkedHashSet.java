package com.prowings.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkedHashSet {
	
	public static void main(String[] args) {
		
		LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add("AAA");
		lhs.add("BBB");
		lhs.add("CCC");
		lhs.add("DDD");
		lhs.add("QQQ");
		lhs.add("CCC");
		lhs.add("FB");
		lhs.add("Ea");
		
		
//		String s = "FB";
//		String s1 = "Ea";
//		
//		lhs.add(s);
//		lhs.add(s1);
//		
//		
//		System.out.println(s.hashCode());
//		System.out.println(s1.hashCode());
//		
//		System.out.println(lhs.hashCode());
//		
//		Iterator  itr = lhs.iterator();
//		
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		System.out.println(lhs);
	}

}
