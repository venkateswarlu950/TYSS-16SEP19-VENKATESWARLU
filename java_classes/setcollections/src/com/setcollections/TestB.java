package com.setcollections;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {
	
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("venkat");
		hs.add("ravi");
		hs.add("greesh");
		
		Iterator<String> i = hs.iterator();
		while(i.hasNext()) {
			String s = i.next();
			
			System.out.println(s);
		}
		
		
	}

}
