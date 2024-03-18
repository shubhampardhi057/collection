package com.prowings.linkedlist;

import java.util.LinkedList;

public class TestLinkedListMethod1 {
	
	public static void main(String[] args) {
		
		LinkedList mylist = new LinkedList();
		
		mylist.add("Shubham");
		mylist.add("Shubham");
		mylist.add(20);
		mylist.add(30.0);
		mylist.add('A');
		mylist.add("Pardhi");
		mylist.add("Pardhi");
		
		
		System.out.println(mylist);
		
//		mylist.push("ABC");
		
//		mylist.add("ABC");
		
//		System.out.println("remove ==>"+ mylist.remove());
//		System.out.println("removeFirst ==>"+ mylist.removeFirst());
//		System.out.println("removeLast  ==>"+ mylist.removeLast());
		
		
		System.out.println("removeFirstOccurrence ==>"+mylist.removeFirstOccurrence("Shubham"));
		System.out.println("removeLastOccurrence ==>"+mylist.removeLastOccurrence("Pardhi"));
		
		
		System.out.println(mylist);
		
		
		
		
		
		
	}

}
