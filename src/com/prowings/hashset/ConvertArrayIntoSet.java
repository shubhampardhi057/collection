package com.prowings.hashset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ConvertArrayIntoSet {
	
	public static void main(String[] args) {
		
		Integer [] num = {10,20,30,10,40,30,50};
		
		
		List  al = Arrays.asList(num);
		
		HashSet hs = new HashSet(al);
		
		System.out.println(hs);
		
		
		Object [] obj = {"ABC",100,200,20.5,200,100,'A'};
		
		List al1 = Arrays.asList(obj);
		
		HashSet hs1 = new HashSet(al1);
		
		System.out.println(hs1);
		
		
		
	}

}
