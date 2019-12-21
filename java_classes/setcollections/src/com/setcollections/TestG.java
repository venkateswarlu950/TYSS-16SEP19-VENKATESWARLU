package com.setcollections;

import java.util.Iterator;
import java.util.TreeSet;

public class TestG {
	
	public static void main(String[] args) {
		
//		SortByMcr m = new SortByMcr();
//		SortByName m = new SortByName();
		SortByPin m = new SortByPin();
		TreeSet<Bank> b = new TreeSet<Bank>(m);
		
		
		Bank b1 = new Bank("andra", 520040, 8759456);
		Bank b2 = new Bank("icici", 5680068, 213548);
		Bank b3 = new Bank("hdfc", 558794, 8744623);
		Bank b4 = new Bank("uco", 6800009, 124569);
		Bank b5 = new Bank("uco", 6800009, 124569);
		
		b.add(b1);
		b.add(b2);
		b.add(b3);
		b.add(b4);
		b.add(b5);
		
		
		System.out.println("====using iterator=======");
		
		Iterator<Bank> i = b.iterator();
		while(i.hasNext()) {
			Bank ba = i.next();
			
			System.out.println(ba.name);
			System.out.println(ba.pincode);
			System.out.println(ba.micr);
			System.out.println("=================");
		}
		
	}

}
