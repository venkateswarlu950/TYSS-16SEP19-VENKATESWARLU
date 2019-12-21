package com.objectclass;

public class TestB {

	public static void main(String[] args) {

		Pen p = new Pen();
		int pHascode = p.hashCode();
		System.out.println("hash code value of pen class::"+pHascode);

		Pen p1 = new Pen();
		int p1Hashcode = p1.hashCode();
		System.out.println("hashcode value of p1::"+p1Hashcode);
		
		TestB b = new TestB();
		String s = b.toString();
		
		System.out.println("to string ::"+s);
	}

}
