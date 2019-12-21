package com.mapinterface.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class TestB {
	
	public static void main(String[] args) {
		
	HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("venkat", 987412365);
		hm.put("reddy", 91245789);
		hm.put("govardan", 996655887);
		hm.put("rakesh", 9774582);
		hm.put("bala", 98875426);
		hm.put("null", 879210);
		hm.put("null", 4578120);
		
HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
		
		hm1.put("deepa", 33);
		hm1.put("karuna", 44);
		hm1.put("lav", 55);
		hm1.put("mounika", 66);
		hm1.put("bahvya", 77);
		hm1.put("null", 88);
		hm1.put("null", 99);
		
		boolean haskey = hm.containsKey("venkat");
		System.out.println(haskey);
		
		hm.putAll(hm1);
		
		System.out.println(hm);
		
		System.out.println(hm.size());
		
		boolean b1 = hm.isEmpty();
		
		System.out.println(b1);
//		
//		hm.clear();
//		
		System.out.println(hm);
		
		Set<String> s = hm.keySet();
		Collection<Integer> c = hm.values();
		
		System.out.println(s);
		System.out.println(c);
				
	}

}
