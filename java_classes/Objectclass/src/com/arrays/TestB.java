package com.arrays;

public class TestB {
	public static void main(String[] args) {
		
		int[] num = {1,2,3,4,5,6};
		
		receive(num);
		
		int[] v = getArray();
		
		for(int g : v) {
			System.out.println(g);
		}
		String[] l = getString();
		for(String s : l) {
			System.out.println(s);
		}

	}
	
	static void receive(int[] numbers) {
		
		for(int i : numbers) {
			System.out.println(i);
		}
		
	}
	
	static int[] getArray() {
		
		int[] values = {4,5,7,8,9,2};
		return values;
		
	}
	static String[] getString() {
		
		String[] s = {"venkat","balaji","ravi","manu"};
		return s;
		
	}
}
