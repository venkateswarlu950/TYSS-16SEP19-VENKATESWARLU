package com.exceptions.first;

public class TestD {
	
	public static void main(String[] args) {
		
		System.out.println("main start");
		
		Paytm p = new Paytm();
		try {
		p.book();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("failed in main");
			throw e;
		}finally {
			System.out.println("excuted anyway");
		}
		
		System.out.println("main end");
		
	}

}
