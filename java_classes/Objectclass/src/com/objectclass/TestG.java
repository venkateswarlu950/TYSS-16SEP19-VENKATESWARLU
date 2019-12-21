package com.objectclass;

public class TestG {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Person p = new Person(12, "ravi");
		System.out.println("p id "+p.id);
		System.out.println("p name "+p.name);
		
		Object o = p.clone();
		
		Person p1 = (Person)o;
		
		p1.id = 20;
		p1.name = "venkat";
		System.out.println("=========after clone=========");
		System.out.println(p1.id);
		System.out.println(p1.name);
		
	}

}
