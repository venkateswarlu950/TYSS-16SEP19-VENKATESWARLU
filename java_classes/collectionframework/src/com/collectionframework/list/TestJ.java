package com.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class TestJ {
	
	public static void main(String[] args) {
		ArrayList<Double> a1 = new ArrayList<Double>();
		a1.add(34.5);
		a1.add(71.2);
		a1.add(null);
		a1.add(null);
		
		System.out.println(a1);
		a1.add(2, 44.5);
		System.out.println(a1);
		a1.remove(3);
		System.out.println(a1);
		Double d = a1.get(2);
		System.out.println(d);
		a1.set(3, 88.0);
		System.out.println(a1);
		a1.contains(88.0);
		
		List<Integer> roll = null;
		roll = new ArrayList<Integer>();
		
		roll.add(25);
		roll.add(52);
		roll.add(44);
		roll.add(74);
		roll.add(null);
		
		System.out.println(roll);
		
		boolean b = roll.addAll(roll);
		System.out.println(b);
		
		boolean b2 = roll.contains(74);
		System.out.println(b2);
		
		}

}
