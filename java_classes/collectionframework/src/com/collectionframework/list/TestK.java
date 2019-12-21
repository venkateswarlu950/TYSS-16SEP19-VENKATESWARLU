package com.collectionframework.list;

import java.util.Collections;
import java.util.LinkedList;

public class TestK {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> li = new LinkedList<Integer>();
		li.add(12);
		li.add(41);
		li.add(51);
		li.add(21);
		li.add(81);
		
		Collections.sort(li);
		System.out.println(li);
		
		Collections.reverse(li);
		System.out.println(li);
		
		Collections.shuffle(li);
		System.out.println(li);
		
	}

}
