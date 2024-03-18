package com.prowings.navigableset;

import java.util.Iterator;
import java.util.TreeSet;

public class NavigableSetMethods {
	
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet<>();
		
		ts.add(20);
		ts.add(60);
		ts.add(10);
		ts.add(30);
		ts.add(40);
		ts.add(50);
		
		
		System.out.println(ts);
		
		
		System.out.println(ts.lower(20));   // Less Than
		
		
		System.out.println(ts.higher(30));   // Greater Than
		
		
		System.out.println(ts.ceiling(45));   // Greater Than equal to
		
		System.out.println(ts.floor(65));     // Less Than equal to
		
		System.out.println(">>>>>>>>>>>>");
		
		
		System.out.println(ts.pollFirst());
		
		System.out.println("After Poll First :"+ts);
		
		System.out.println(ts.pollLast());
		
		System.out.println("After Poll Last :"+ts);
		
		
		Iterator itr  = ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("Using DescendingIterator : ");
		
		Iterator itr1 = ts.descendingIterator();
		
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		TreeSet ts1 = (TreeSet) ts.descendingSet();
		
		System.out.println(ts1);
		
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		
		TreeSet ts2 = (TreeSet) ts.headSet(30, true);
		
		System.out.println("HeadSet:"+ts2);
		
		TreeSet ts3 = (TreeSet) ts.tailSet(30,true);
		
		System.out.println("TailSet:"+ts3);
		
		TreeSet ts4 = (TreeSet) ts.subSet(20,true,60,true);
		
		System.out.println("SubSet:"+ts4);
		
	
		
	}

}
