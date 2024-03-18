package com.prowings.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedListDecendingIterator {
	
	public static void main(String[] args) {
		
		LinkedList mylist = new LinkedList();
		
		mylist.add("AAA");
		mylist.add("BBB");
		mylist.add("10");
		mylist.add("CCC");
		mylist.add("20");
		mylist.add("DDD");
		
		Iterator itr = mylist.descendingIterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
