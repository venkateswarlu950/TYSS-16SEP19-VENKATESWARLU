package com.immutable;

public class TestString {
	
	public static void main(String[] args) {
		
		MyString ms = new MyString(20, "ravindar");
		
		System.out.println(ms.getName());
		System.out.println(ms.getRollNo());
		System.out.println(ms);
		MyString m = ms.changeContent(40, "venkat");
		
		System.out.println(m.getName());
		System.out.println(m.getRollNo());
		
	}

}
