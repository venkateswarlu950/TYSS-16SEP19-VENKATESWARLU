package com.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestF {
	
	public static void main(String[] args) {
		
		ArrayList<TestE> ap = new ArrayList<TestE>();
		
		TestE pen = new TestE(50, "bitco");
		TestE pen1 = new TestE(40, "relonds");
		TestE pen2= new TestE(30, "rup");
		TestE pen3 = new TestE(60, "camel");
		TestE pen4 = new TestE(20, "gel");
		
		ap.add(pen);
		ap.add(pen1);
		ap.add(pen2);
		ap.add(pen3);
		ap.add(pen4);
		display(ap);
		
		SortByPrice sb = new SortByPrice();
		Collections.sort(ap, sb);
		display(ap);
		
		
	
	}
	public static void display(ArrayList<TestE> p) {
		
			Iterator<TestE> i = p.iterator();
			
			while(i.hasNext()) {
				TestE p1 = i.next();
				System.out.println(p1.price);
				System.out.println(p1.name);
				
			}
		
	}



}

