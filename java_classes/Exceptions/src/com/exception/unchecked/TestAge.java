package com.exception.unchecked;

public class TestAge {
	
	public static void main(String[] args) {
		
		System.out.println("main start");
		
		Validator v = new Validator();
		try {
		v.verify(12);
		}
		catch(Exception e) {
			System.out.println("exception occurred");
			e.printStackTrace();
			
		}
		
		
		System.out.println("main ended");
		
	}

}
