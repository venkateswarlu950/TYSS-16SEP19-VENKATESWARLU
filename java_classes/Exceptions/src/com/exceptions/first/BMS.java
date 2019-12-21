package com.exceptions.first;

public class BMS {
	
	public static void main(String[] args) {
		
		System.out.println("bms started");
		
		PVR p = new PVR();
		try {
		p.book();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("bms booking failed");
		}
		
		System.out.println("bms end");
		
	}

}
