package com.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestE {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("anupama");
		al.add("savitha");
		al.add("kavitha");
		al.add("sunitha");

		String s = al.get(0);
		
		System.out.println(s.toUpperCase());
		Iterator<String> i = al.iterator();
		
		while(i.hasNext()) {
			
		String ss = i.next();
		
		System.out.println(ss);
			
		}
		System.out.println("=========using listit=====");
		
		ListIterator<String> li = al.listIterator();
		
		while(li.hasNext()) {
			String s1 = li.next();
			System.out.println(s1);
		}

	}

}
