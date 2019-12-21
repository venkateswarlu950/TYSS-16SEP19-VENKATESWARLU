package com.objectclass;

public class TestF {
	
	public static void main(String[] args) {
		
		
		Employee e = new Employee(101, "chandra", 30000);
		Employee e1 = new Employee(102, "chandru", 40000);
		Employee e2 = new Employee(101, "chandra", 30000);
		
		System.out.println(e.equals(e1));
		
		System.out.println(e.equals(e2));
		
		String s = e.toString();
		String s1 = e1.toString();
		String s2 = e2.toString();
		
		System.out.println(s+" "+s1+" "+s2);
		
	}

}
