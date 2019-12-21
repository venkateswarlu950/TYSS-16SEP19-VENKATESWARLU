package com.exception.checkedcustmize;

public class TestAmount {
	
	public static void main(String[] args) {
		
		System.out.println("main start");
		
		ValidateAmount a = new ValidateAmount();
		
		try {
			a.checkAmount(50000);
		} catch (InvalidAmount e) {
			System.err.println(e.getMessage());
			e.getMessage();
		}
		
		
		
		System.out.println("main ended");
	}

}
