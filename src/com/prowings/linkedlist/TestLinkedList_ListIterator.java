package com.prowings.linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class TestLinkedList_ListIterator {
	
	public static void main(String[] args) {
		
		LinkedList mylist = new LinkedList();
		
		mylist.add("Shubham");
		mylist.add(50);
		mylist.add('A');
		mylist.add(30.5);
		mylist.add("Pardhi");
		
		
		System.out.println(mylist);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		ListIterator ltr = mylist.listIterator(5);
		
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
		
	}

}
