package com.mapinterface.map;

import java.util.HashMap;

public class TestA {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("venkat", 987412365);
		hm.put("reddy", 91245789);
		hm.put("govardan", 996655887);
		hm.put("rakesh", 9774582);
		hm.put("bala", 98875426);
		hm.put("null", 879210);
		hm.put("null", 4578120);
		
		System.out.println("map is ::"+hm);
		
		hm.put("bala", 73526489);
		System.out.println("after add map is::"+hm);
		Object val1 = hm.get("venkat");
		Object val2 = hm.get("bala");
		System.out.println(val1);
		System.out.println(val2);
		
		Object rm1 = hm.remove("rakesh");
		System.out.println(rm1);
		System.out.println("after remove ::"+hm);
		
		
	}

}
