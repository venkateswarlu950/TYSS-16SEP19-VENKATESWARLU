package com.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestF {
	
	public static void main(String[] args) {
		
		LinkedList li = new LinkedList();
		
		
		li.add(12);
		li.add("venkat");
		
		
		System.out.println("using for loop");
		
		for(int i = 0; i<li.size(); i++) {
			System.out.println(li.get(i));
		}
		
		System.out.println("=using for each");
		
		for(Object obj : li) {
			System.out.println(obj);
		}
		System.out.println("using iterator");
		
		Iterator it = li.iterator();
		
		while(it.hasNext()) {
			Object ob= it.next();
			System.out.println(ob);
		}
		
		System.out.println("using listiterator");
		
		ListIterator ls = li.listIterator();
		
		while(ls.hasNext()) {
			
			Object obj = ls.next();
			
			System.out.println(obj);
		}
		while(ls.hasPrevious()) {
		Object obj2	= ls.previous();
		System.out.println(obj2);
		}
	}

}
