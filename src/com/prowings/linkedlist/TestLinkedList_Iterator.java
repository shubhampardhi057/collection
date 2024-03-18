package com.prowings.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedList_Iterator {
	
	public static void main(String[] args) {
		
		LinkedList mylist  = new LinkedList();
		
		mylist.add("Shubham");
		mylist.add(20);
		mylist.add(20.5);
		mylist.add('A');
		mylist.add("Pardhi");
		
		
		System.out.println(mylist.size());
		
		
		Iterator itr = mylist.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
		
		
		
		
	}

}
