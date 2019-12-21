package com.sorting.list;

import java.util.Stack;

public class TestD {
	public static void main(String[] args) {
		
		Stack<Integer> si = new Stack<Integer>();
		si.push(12);
		si.push(8);
		si.push(25);
		
		
		System.out.println("using get");
		for (int i=0; i<si.size(); i++) {
			System.out.println(si.get(i));
		}
		int j = si.size();
		System.out.println("using pop()");
		
		for(int i=0; i<j;i++) {
			System.out.println(si.pop());
		}
		System.out.println(si);
		
	}

}
