package com.prowings.queue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeDemo {
	
	public static void main(String[] args) {
		
		ArrayDeque ad = new ArrayDeque();
		
		ad.add("AAA");
		ad.add("CCC");
		ad.add("WWW");
		ad.add("BBB");
		ad.add("SSS");
		ad.add("QQQ");
		ad.add("EEE");
		ad.add("DDD");
		
		
		System.out.println(ad);
		
		Iterator itr = ad.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
