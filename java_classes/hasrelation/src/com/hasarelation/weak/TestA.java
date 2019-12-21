package com.hasarelation.weak;

public class TestA {
	public static void main(String[] args) {
		
		Person p = new Person();
		
		System.out.println("person name ::"+p.name);
		
		p.eat();
		p.sleep();
		
		System.out.println("name in marker::"+p.m.name);
		p.m.write(); //has - a relation
		
	}

}
