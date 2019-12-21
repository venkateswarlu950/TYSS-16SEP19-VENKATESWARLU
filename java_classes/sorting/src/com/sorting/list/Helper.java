package com.sorting.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper {

	void displayallStu(ArrayList<Student> pl) {

		Iterator<Student> i = pl.iterator();
		while(i.hasNext()) {

			Student s =  i.next();

			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.per);
		}

   }
	
	
	
	void displayFailed(ArrayList<Student> as) {
		System.out.println("=========failed students============");
		List<Student> ls =    as.stream().filter(stu -> stu.per >= 40).collect(Collectors.toList());
		
		Iterator<Student> i1 = ls.iterator();
		while(i1.hasNext()) {
			Student ss1 = i1.next();
			
			System.out.println(ss1.id);
			System.out.println(ss1.name);
			System.out.println(ss1.per);
		}
		
	}
	
	Comparator<Student> comps = (p1 , p2) -> {
		
		Double d1 = p1.per;
		Double d2 = p2.per;
		
		return d1.compareTo(d2);
		
		
	};
	
	void displayTopper(ArrayList<Student> ap) {
	
		
		System.out.println("=========topper students============");
		Student mn =    ap.stream().max(comps).get();
		 System.out.println(mn.id);
		 System.out.println(mn.name);
		 System.out.println(mn.per);
		
		}
		
	}
	
	


