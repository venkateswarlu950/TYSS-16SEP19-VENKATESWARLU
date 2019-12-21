package com.exceptions.first;

public class PVR {

	public void book() {

		System.out.println("booking started");
		try {
			System.out.println(10/0);
			System.out.println("booking confirmed");
		}catch(Exception e) {
			
			e.printStackTrace();
			System.out.println("booking failed");
			throw e;
		}


	}

}
