package com.prowings.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestLinkedListConstuctor {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("Shubham");
		al.add(10);
		al.add(20.5);
		al.add('A');
		al.add("Pardhi");
		
//		LinkedList mylist = new LinkedList();      // no-arg Constructor
		
		LinkedList myLlist = new LinkedList(al);    // Conversion Constuctor
		
		
//		myLlist.addAll(al);
		
		
		System.out.println(myLlist.size());
		
		
		System.out.println(al);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>.");
		System.out.println(myLlist);
		
		
	}

}
