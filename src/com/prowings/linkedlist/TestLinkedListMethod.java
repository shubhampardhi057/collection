package com.prowings.linkedlist;

import java.util.LinkedList;

public class TestLinkedListMethod {
	
	public static void main(String[] args) {
		
		LinkedList mylist = new LinkedList();
		
		mylist.add("Shubham");
		mylist.add("pardhi");
		mylist.add("sujit");
		mylist.add(10);
		mylist.add('A');
		mylist.add(15.5);
		
		
		System.out.println(mylist.size());
		
		System.out.println(mylist);
		
		mylist.pop();
		
		System.out.println(mylist);
	}

}
