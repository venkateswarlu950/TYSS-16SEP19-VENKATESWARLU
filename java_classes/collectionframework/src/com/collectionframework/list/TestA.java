package com.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestA {
	
	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add("ravi");
		a1.add(22.1);
		a1.add(true);
		a1.add(null);
		
		Iterator it = a1.iterator();
		Object o1 = it.next();
		System.out.println("obj1 ::"+o1);
		
		Object o2 = it.next();
		System.out.println("obj1 ::"+o2);
		
		Object o3 = it.next();
		System.out.println("obj1 ::"+o3);
		
		Object o4 = it.next();
		System.out.println("obj1 ::"+o4);
		
		boolean b = it.hasNext();
		System.out.println(b);
		
		Object o5 = it.next();
		System.out.println("obj1 ::"+o5);
		
		System.out.println("===========for loop ==========");
		
		
		for(int i=0;i<a1.size();i++) {
			Object o = a1.get(i);
			System.out.println(o);
		}
		
		ArrayList a2 = new ArrayList();
		a2.add(1222);
		a2.add("raja sekar");
		a2.add(99.1);
		a2.add(true);
		a2.add(null);
		
		System.out.println("=============using iterator ============");
		Iterator i2 = a2.iterator();
		
		while(i2.hasNext()) {
			
			Object o21 = i2.next();
			
			System.out.println(o21);
		}
		
	}

}
