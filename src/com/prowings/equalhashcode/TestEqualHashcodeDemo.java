package com.prowings.equalhashcode;

public class TestEqualHashcodeDemo {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(101,"Ram","Pune");
		
		Employee emp2 = emp1;
		
		Employee emp3 = new Employee(102,"Sham","Mumbai");
		
		
		System.out.println(emp1);
		System.out.println(emp2);
		
		
		
		System.out.println(emp1 == emp2);
		
		System.out.println(emp1.equals(emp2));
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		
		System.out.println(emp1 == emp3);
		
		System.out.println(emp3.hashCode());
		
		
		
		
		
		
		
	}

}
