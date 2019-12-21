package com.mapinterface.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class TestF {

	public static void main(String[] args) {

		Student s1 = new Student(2, "divya", 67.2);
		Student s2 = new Student(1, "teja", 77.2);
		Student s3 = new Student(5, "kiran", 57.2);
		Student s4 = new Student(12, "dinesh", 87.2);
		Student s5 = new Student(6, "ambika", 27.2);
		Student s6 = new Student(9, "giri", 97.2);


		ArrayList<Student> as = new ArrayList<Student>();

		as.add(s1);
		as.add(s2);
		ArrayList<Student> as1 = new ArrayList<Student>();
		as1.add(s3);
		as1.add(s4);
		ArrayList<Student> as3 = new ArrayList<Student>();
		as3.add(s5);
		as3.add(s6);

		HashMap<String, ArrayList<Student>> mp = new HashMap<String, ArrayList<Student>>();

		mp.put("first", as);
		mp.put("second", as1);
		mp.put("third", as3);

		ArrayList<Student> al =	mp.get("second");
		
		System.out.println(al);
		
		System.out.println("=====iterator==========");
		
		Iterator<Student> i = al.iterator();
		System.out.println(i);
		while(i.hasNext()) {
			System.out.println("in while");
			
		Student s =i.next();
		
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.per);
		System.out.println("================");
		}



	}

}
