package com.setcollections;

import java.util.HashSet;

public class TestA {
	
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add("deepa");
		hs.add(12);
		hs.add(56.7);
		hs.add(null);
		hs.add(null);
		
		for(Object hs1 : hs) {
			System.out.println(hs1);
		}
	}

}
