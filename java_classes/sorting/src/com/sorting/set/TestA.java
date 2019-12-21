package com.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestA {
	
	public static void main(String[] args) {
		
		
//		Comparator<Employee> comp = (e1,e2) -> {
//			if(e1.height > e2.height) {
//				return 1;
//				
//			}else if (e1.height < e2.height) {
//				return -1;
//			}else {
//				return 0;
//			}
//		};
		
		Comparator<Employee> comp = (e1,e2) -> {
			return e1.name.compareTo(e2.name);
		};
//	
		
		TreeSet<Employee> te = new TreeSet<Employee>(comp);
		
		Employee e1 = new Employee(786, "santhos", 6.0);
		Employee e2 = new Employee(896, "madhu", 6.3);
		Employee e3 = new Employee(420, "ramesh", 5.0);
		Employee e4 = new Employee(124, "althaf", 4.0);
		Employee e5 = new Employee(113, "srinu", 7.0);
		
		te.add(e1);
		te.add(e2);
		te.add(e3);
		te.add(e4);
		te.add(e5);
		
		System.out.println("=====iterator using==========");
		
		Iterator<Employee> i = te.iterator();
		while(i.hasNext()) {
			Employee e = i.next();
			System.out.println(e.id);
			System.out.println(e.name);
			System.out.println(e.height);
			System.out.println("===========================");
			
		}
		
	}

}
