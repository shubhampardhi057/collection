package com.prowings.arraylist;

import java.util.ArrayList;

public class TestArrayListRemoveRangeMethod extends ArrayList {
	
	public static void main(String[] args) {
		
		TestArrayListRemoveRangeMethod lst = new TestArrayListRemoveRangeMethod();
		
		
		lst.add("A");
		lst.add("B");
		lst.add("C");
		lst.add("D");
		lst.add("E");
		lst.add("F");
		
		System.out.println(lst);
		

		System.out.println("removing elements with range");
		
		lst.removeRange(0,3);
		
		System.out.println(lst);
		
	}

}
