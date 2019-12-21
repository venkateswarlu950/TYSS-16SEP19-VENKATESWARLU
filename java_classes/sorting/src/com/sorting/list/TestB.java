package com.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestB {
	
	public static void main(String[] args) {
		
		
		Laptop lp = new Laptop(5000, 2, "hp");
		Laptop lp1 = new Laptop(6000, 3, "acer");
		Laptop lp2 = new Laptop(8000, 1, "sony");
		Laptop lp3 = new Laptop(4000, 4, "lenova");
		
		LinkedList<Laptop> li = new LinkedList<Laptop>();
		
		li.add(lp);
		li.add(lp1);
		li.add(lp2);
		li.add(lp3);
		
		display(li);
		Collections.sort(li);
		System.out.println("after sorting");
		display(li);
		
		
		
	}

	public static void display(LinkedList<Laptop> l) {
		Iterator<Laptop> ip = l.iterator();
		while(ip.hasNext()) {
			Laptop lp = ip.next();
			System.out.println(lp.price);
			System.out.println(lp.ram);
			System.out.println(lp.name);
		}
	}
}
