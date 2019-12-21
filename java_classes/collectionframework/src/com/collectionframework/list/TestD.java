package com.collectionframework.list;

import java.util.ArrayList;

public class TestD {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add("samantha");

		Object o= al.get(0);
		
		String s = (String)o;
		
		s = s.toUpperCase();
		System.out.println(s);

	}

}
