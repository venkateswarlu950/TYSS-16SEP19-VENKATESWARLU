package com.exceptions.first;

public class IRCTC {
	
	public void confirm() {
		
		System.out.println("irctc open ticket");
		try {
		System.out.println(10/0);
		
		System.out.println("ticket confirm");
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
