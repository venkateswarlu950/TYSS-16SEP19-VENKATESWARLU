package com.typeCasting.reference;

public class TestA {
	
	public static void main(String[] args) {
		
		Pen p = new Marker();
		System.out.println(p.cost);
		p.write();
		
		Marker m = (Marker)p;
		m.color();
		m.write();
		System.out.println("size is ::"+m.size);
		
		
	}

}
