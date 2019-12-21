package com.predicate;

import java.util.function.Function;

import com.java8features.Student;

public class TestB {
	
	
	public static void main(String[] args) {
		
		Function<Integer, Integer> f = i -> i*i;
		
		Integer i = f.apply(10);
		System.out.println(i);
		
		Function<Integer, Student> f1 = id -> {
			Student s = new Student(2, "vijay", 55.7);
			s.id = id;
			
			
			return s;
			
		};
		Student s1 = f1.apply(27);
		System.out.println(s1.id);
		
	}

}
