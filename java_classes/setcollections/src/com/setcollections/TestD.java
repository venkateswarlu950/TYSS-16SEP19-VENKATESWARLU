package com.setcollections;

import java.util.TreeSet;

public class TestD {
	
	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("roopa");
		ts.add("jaya");
		ts.add("susma");
		ts.add("munni");
		ts.add("sheela");
		
		System.out.println("using for each");
		
		for(String s : ts) {
			System.out.println(s);
		}
		
	}

}
