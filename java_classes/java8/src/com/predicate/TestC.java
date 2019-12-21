package com.predicate;

import java.util.function.Consumer;
import java.util.function.Supplier;

import com.java8features.Student;

public class TestC {

	public static void main(String[] args) {

		Supplier<Student> ss = () -> new Student(22, "vikram", 33);

		Student s1 = ss.get();

		System.out.println(s1.id);

		Supplier<String> sf = () -> "Good eve";

		String v = sf.get();
		System.out.println(v);
		
		Consumer<Student> c = (s) -> {
		
			System.out.println(s.id);
		};
		Student e = new Student(10, "ramu", 22.5);
		c.accept(e);
	}

}
