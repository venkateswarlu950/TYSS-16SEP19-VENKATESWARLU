package com.exceptions.first;

public class Paytm {
	
	public void book() {
		
		System.out.println("paytm start");
		
		IRCTC i = new IRCTC();
		try {
		i.confirm();
		
		
		System.out.println("paytm end");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("failed paytm");
		}
	}

}
