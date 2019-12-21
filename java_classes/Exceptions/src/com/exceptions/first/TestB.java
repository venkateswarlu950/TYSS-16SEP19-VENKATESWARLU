package com.exceptions.first;

public class TestB {
	
	public static void main(String[] args) {
		
		System.out.println("main start");
		
		int a = 10;
		int b = 0;
		try {
			
		 b = a/0;
		 System.out.println(b);
		 System.out.println("hello");
		 System.out.println("happy diwali");//invalid once exception raise in before line in try block
		
		}
		catch(ArithmeticException a1) {
			System.out.println("number divided by zero");
			
		}
		
		System.out.println("main end");
	}

}
