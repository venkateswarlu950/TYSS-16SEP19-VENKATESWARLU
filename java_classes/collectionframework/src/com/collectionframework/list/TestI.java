package com.collectionframework.list;

import java.util.ArrayList;

public class TestI {
	
	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		Student s1 = new Student(1, "venkat", 85.2);
		Student s2 = new Student(2, "samantha", 88.2);
		Student s3 = new Student(1, "akhil", 85.2);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		System.out.println("=====using for loop=======");
		
		for(int i =0; i<al.size();i++) {
			Student s = al.get(i);
			
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.per);
		}
		
		System.out.println("for each methos");
		
		for(Student s : al) {
			System.out.println(s);
		}
		
		
	}

}
