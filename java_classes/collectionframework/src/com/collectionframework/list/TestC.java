package com.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestC {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(45.6);
		al.add("yash");
		al.add(true);
		
		ListIterator li = al.listIterator();
		System.out.println("========forward===========");
		while(li.hasNext()) {
			Object o1 = li.next();
			System.out.println(o1);
		}
		System.out.println("======backward=============");
		while(li.hasPrevious()) {
			Object o = li.previous();
			System.out.println(o);
			
		}
	}
	
	
	

}
