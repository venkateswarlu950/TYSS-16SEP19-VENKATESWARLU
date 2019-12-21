package com.mapinterface.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestD {
	
	public static void main(String[] args) {
		
TreeMap<String, Integer> hm1 = new TreeMap<String, Integer>();
		
		hm1.put("deepa", 33);
		hm1.put("karuna", 44);
		hm1.put("lav", 55);
		hm1.put("mounika", 66);
		hm1.put("bahvya", 77);
//		hm1.put(null, 88); null pointer exception
		
		System.out.println(hm1);
		
		for(Map.Entry<String, Integer> mp : hm1.entrySet()) {
			String s = mp.getKey();
		    Integer i = mp.getValue();
		    
		    System.out.println(s);
		    System.out.println(i);
		}
	}

}
