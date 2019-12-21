package com.setcollections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class TestC {
	
	public static void main(String[] args) {
		
		LinkedHashSet li = new LinkedHashSet();
		
		li.add("chandra");
		li.add(25);
		li.add(33.2);
		li.add("bavya");
		li.add(null);
		li.add(null);
		
		Iterator i = li.iterator();
		while(i.hasNext()) {
			Object p = i.next();
			
			System.out.println(p);
		}
		
	}

}
