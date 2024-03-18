package com.prowings.generics;

public class TestGenerics {

	public static void main(String[] args) {
		
		Box<String> b1 = new Box<>();
		
		
		b1.setItem("AAA");
		
		System.out.println(b1.getItem());
		
		
		Box<Integer> b2 = new Box<>();
		
		b2.setItem(1234);
		
		System.out.println(b2.getItem());
		
		
		Pair<String,Integer> p1 = new Pair<>();
		
		p1.setKey("AAA");
		
		p1.setValue(1234);
		
		System.out.println("Key :-"+p1.getKey());
		
		System.out.println("Value :-"+ p1.getValue());
		
	}
}
