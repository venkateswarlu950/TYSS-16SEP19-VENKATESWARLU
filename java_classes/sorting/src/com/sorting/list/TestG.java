package com.sorting.list;

import java.util.ArrayList;

public class TestG {
	public static void main(String[] args) {
		
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		al.add(new Student(1, "virat", 99));
		al.add(new Student(5, "sachin", 84));
		al.add(new Student(4, "nab", 40));
		al.add(new Student(3, "signgh", 20));
		
		Helper h = new Helper();
		h.displayallStu(al);
		h.displayFailed(al);
		h.displayTopper(al);
	
	}

}
