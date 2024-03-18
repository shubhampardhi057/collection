package com.prowings.generics;

public class GenericsMethodDemo {
	
	public static void main(String[] args) {
		
		Integer i = 123;
		Long l = 456l;
		Float f = 456.0f;
		Number n = 987;
		Object o = 765;
		String s = "AAA";
		
		
		getData(i);
		
		getNumber(l);
		
		getNumber(n);
		getNumber(i);
		getNumber(f);
		getNumber(l);
//		getNumbers(o);
//		getNumbers(s);
		
		
		
	}
	
	public static <T> void getData(T data) {
		
		System.out.println("Data is of type :- "+ data.getClass().getName()+" and value is :- "+ data);
	}

	public static <T extends Number> void getNumber(T data) {
		
		System.out.println("Data is of type :- "+ data.getClass().getName()+" and value is :- "+ data);
		
	}
}
