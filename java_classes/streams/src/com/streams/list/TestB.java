package com.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestB {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> am = new ArrayList<Employee>();
		
		Employee e1 = new Employee(1, "venkat");
		Employee e2 = new Employee(5, "prakash");
		Employee e3 = new Employee(2, "srikanth");
		Employee e4 = new Employee(4, "avinash");
		Employee e5 = new Employee(3, "kiran");
		
		am.add(e1);
		am.add(e2);
		am.add(e3);
		am.add(e4);
		am.add(e5);
		
		Comparator<Employee> comp = (s1, s2) -> {
			
			String n = s1.name;
			String n1 = s2.name;
			return n.compareTo(n1);
		};
		
		List<Employee> le = am.stream().sorted(comp).collect(Collectors.toList());
		Iterator<Employee> i = le.iterator();
		while (i.hasNext()) {
			Employee y = i.next();
			
			System.out.println(y.id);
			System.out.println(y.name);
		}
		
	}

}
