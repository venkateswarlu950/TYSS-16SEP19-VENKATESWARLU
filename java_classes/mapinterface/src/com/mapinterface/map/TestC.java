package com.mapinterface.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestC {
	
	public static void main(String[] args) {
		
LinkedHashMap<String, Integer> hm1 = new LinkedHashMap<String, Integer>();
		
		hm1.put("deepa", 33);
		hm1.put("karuna", 44);
		hm1.put("lav", 55);
		hm1.put("mounika", 66);
		hm1.put("bahvya", 77);
		hm1.put("null", 88);
		hm1.put("null", 99);
		
		for(Map.Entry<String, Integer> m : hm1.entrySet()) {
			
			String s = m.getKey();
			Integer i =m.getValue();
			
			System.out.println(s+ "//"+i);
		}
		
	}

}
