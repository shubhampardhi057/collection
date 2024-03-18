package com.prowings.stack;

import java.util.Stack;

public class TestStackMethod {
	
	public static void main(String[] args) {
		
		Stack stack = new Stack();
		
		stack.add("Shubham");
		stack.add(30);
		stack.add(40.5);
		stack.add("Pardhi");
		
		
		System.out.println(stack.isEmpty());
		
		System.out.println(stack.peek());
		
		System.out.println(stack.pop());
		
		System.out.println(stack.push("Shubham"));
		
		System.out.println(stack.search("Shubham"));
		
		
		
		System.out.println("Stack :"+ stack);
		
	}

}
