package com.setcollections;

import java.util.Comparator;

public class SortByPin implements Comparator<Bank> {

	@Override
	public int compare(Bank o1, Bank o2) {
		if(o1.pincode > o2.pincode) {
			return 1;
			
		}else if(o1.pincode < o2.pincode){
			return -1;
		}else {
		
		return 0;
		}
	}

}
