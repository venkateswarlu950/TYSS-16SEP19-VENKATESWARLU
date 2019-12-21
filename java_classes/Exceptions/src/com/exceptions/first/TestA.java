package com.exceptions.first;

public class TestA {

	public static void main(String[] args) {

		System.out.println("main start");

		int[] a = {10,20,30};
		int b =10;
		System.out.println(a[1]);
		try {
			
			System.out.println(a[2]);
			System.out.println(b/0);
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			
			ae.printStackTrace();
			System.out.println("array index not present");

		}catch(ArithmeticException ae) {
			System.out.println("number divided by zero");
		}

		System.out.println("main end");

	}

}
