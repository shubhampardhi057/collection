package com.prowings.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestLinkedList {
	
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		
		ll.add("hello");
		ll.add("hii");
		ll.add(100);
		ll.add(200);
		ll.add('A');
		ll.add(null);
		
		System.out.println(ll);
		
		Iterator  itr = ll.iterator();
		
		while(itr.hasNext())
		{
			System.out.println("iterated elements are : -- >  "+ itr.next());
		}
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		ListIterator ltr = ll.listIterator(6);
		
		while(ltr.hasPrevious())
		{
			System.out.println("ListIterated elements are : -- >  "+ ltr.previous());
		}
	}

}
