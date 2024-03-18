package com.prowings.generics;

public class GenericMethodMultipleBoundsDemo {
	
	public static void main(String[] args) {
		
		getNumber(123);
	}

	public static <T extends Number & Comparable<T>> void getNumber(T data) {
		
	System.out.println("Data is of type :- "+ data.getClass().getName() + " and value is :- "+ data);
	
	}
}
