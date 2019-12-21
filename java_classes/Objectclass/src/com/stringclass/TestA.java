package com.stringclass;

public class TestA {
	
	public static void main(String[] args) {
		String s1 = "meena";
		
		String s2 = "roja";
		
		String s3 = new String("meena");
		String s4 = new String("meena");
		String s5 = "meena";
		
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s5));
		
		boolean b = s1.equalsIgnoreCase("MEENa");
		System.out.println(b);
		char c = s1.charAt(2);
		System.out.println(c);
		
		System.out.println("=========================");
		
		StringBuffer sb1 = new StringBuffer("kavya");
		sb1.append(" yenuganti");
		System.out.println(sb1);
		
		
	}

}
