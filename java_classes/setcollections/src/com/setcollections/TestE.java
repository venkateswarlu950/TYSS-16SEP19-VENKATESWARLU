package com.setcollections;

import java.util.HashSet;
import java.util.Iterator;

public class TestE {
	
	public static void main(String[] args) {
		
		HashSet<Employee> he = new HashSet<Employee>();
		
		Employee e1 = new Employee(10001, "chandan", 80000);
		Employee e2 = new Employee(10002, "vikas", 70000);
		Employee e3 = new Employee(10003, "abhi", 50000);
		Employee e4 = new Employee(10004, "raja", 90000);
		Employee e5 = new Employee(10004, "raja", 90000);
		
		he.add(e1);
		he.add(e2);
		he.add(e3);
		he.add(e4);
		he.add(e5);
		
		System.out.println("=====using iterator=====");
		
		Iterator<Employee> i = he.iterator();
		while(i.hasNext()) {
			Employee e = i.next();
			System.out.println(e.id);
			System.out.println(e.name);
			System.out.println(e.salary);
			
			System.out.println("=====================");
		}
	}

}
