package com.java8features;

import java.util.function.Predicate;

public class TestB {
	
	public static void main(String[] args) {
		
		Predicate<Student> p = (s) -> {
			if(s.per >= 35) {
				return true;
			}else {
				return false;
			}
		};
		
		Student s = new Student(1, "anup", 45.6);
		boolean b = p.test(s);
		System.out.println(b);
	}

}
