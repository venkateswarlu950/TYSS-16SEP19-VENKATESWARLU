package com.exceptions.first;

public class TestC {

	public static void main(String[] args) {

		System.out.println("main start");

		int[] a = {10,20,30};
		int b =10;
		System.out.println(a[1]);
		try {
			
			System.out.println(a[3]);
			
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			
			System.out.println("array index not present");

		}
		try {
			System.out.println(b/0);
		}
		
		catch(ArithmeticException ae) {
			System.out.println("number divided by zero");
		}

		System.out.println("main end");

	}

}
