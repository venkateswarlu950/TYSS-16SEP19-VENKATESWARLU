package com.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestA {
	
	public static void main(String[] args) {
		Student s = new Student(1, "hnd", 452.2);
		Student s1 = new Student(2, "jhjhlk", 47.2);
		
		ArrayList<Student> a = new ArrayList<Student>();
		
		a.add(s);	
		a.add(s1);
		
		System.out.println(a);
		display(a);
		Collections.sort(a);
		
	}
	
	public static void display(ArrayList<Student> a1) {
		Iterator<Student> i = a1.iterator();
		while(i.hasNext()) {
			Student ss = i.next();
			System.out.println(ss.id);
			System.out.println(ss.name);
			
			System.out.println(ss.per);
		}
		
	}

}
