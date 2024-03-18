package com.prowings.stack;

import java.util.Stack;

public class TestStackConstructor {
	
	
	public static void main(String[] args) {
		
		Stack stack = new Stack();     //  no-arg constuctor of stack 
		
		
		stack.add("Shubham");
		stack.add(40);
		stack.add(30.5);
		stack.add("Pardhi");
		
		
		System.out.println("Stack : "+ stack);
	}

}
