package com.setcollections;

import java.util.Comparator;

public class Bank {
	
	String name;
	int pincode;
	long micr;
	public Bank(String name, int pincode, long micr) {
		super();
		this.name = name;
		this.pincode = pincode;
		this.micr = micr;
	}
//	@Override
//	public int compare(Bank o1, Bank o2) {
//		if(o1.micr > o2.micr) {
//			return 1;
//			
//		}else if (o1.micr< o2.micr) {
//			return -1;
//		}else {
//		// TODO Auto-generated method stub
//		return 0;
//		}
//	}
	
	
	

}
