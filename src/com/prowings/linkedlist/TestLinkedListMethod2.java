package com.prowings.linkedlist;

import java.util.LinkedList;

public class TestLinkedListMethod2 {
	
	public static void main(String[] args) {
		
		LinkedList mylist = new LinkedList();
		
		mylist.add("Shubham");
		mylist.add(30);
		mylist.add(50.0);
		mylist.add("Pardhi");
		
		System.out.println("Before :"+ mylist);
		
		mylist.addFirst("AAA");
		mylist.addLast("CCC");
		
		
		System.out.println("elements ==>"+mylist.element());
		System.out.println("getFirst ==>"+mylist.getFirst());
		System.out.println("getLast  ==>"+mylist.getLast());
		
		
		mylist.offer("DDD");
		mylist.offerFirst("EEE");
		mylist.offerLast("SSS");
		
		
		System.out.println("peek ==>"+ mylist.peek());
		System.out.println("peekFirst ==>"+ mylist.peekFirst());
		System.out.println("peekLast  ==>"+ mylist.peekLast());
		
//		System.out.println("poll ==>"+ mylist.poll());
//		System.out.println("pollFirst ==>"+ mylist.pollFirst());
//		System.out.println("pollLast ==>"+ mylist.pollLast());
		
//		System.out.println("pop ==>"+ mylist.pop());
		
		
		
		
		
		
		System.out.println("After  :"+ mylist);
	}

}
