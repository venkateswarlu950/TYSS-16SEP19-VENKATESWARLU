package com.arrays;

public class TestC {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(1, "array", 77.8);
		Student s2 = new Student(2, "object", 88.9);
		Student s3 = new Student(3, "String", 9.5);
		
		Student[] students = new Student[3];
		students[0]=s1;
		students[1]=s2;
		students[2]=s3;
		
		for(Student d : students) {
			System.out.println(d);
		}
		
		receive(students);
		
	}
	static void receive (Student[] stu) {
		
		for(Student u : stu) {
			System.out.println(u);
		}
		
	}

}
