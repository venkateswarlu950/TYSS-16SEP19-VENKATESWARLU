package com.objectclass;

public class TestC {

	public static void main(String[] args) {
		Student s = new Student(110, "venkat", 98.3);
		System.out.println(s);
		int sHashcode = s.hashCode();
		System.out.println("hascode value ::"+sHashcode);
		String s1 = s.toString();
		System.out.println(s1);
		s.printDetails();
	}

}
