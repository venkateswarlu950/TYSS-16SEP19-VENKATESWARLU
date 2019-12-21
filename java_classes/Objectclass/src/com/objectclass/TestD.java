package com.objectclass;

public class TestD {
	
	public static void main(String[] args) {
		
		Car c = new Car(5000000, "MRF", "Indigo");
		Car c1 = new Car(2000000, "BMW", "blue");
		Car c2 = new Car(10000000, "Audi", "black");
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		int cHashcode = c.hashCode();
		int c1Hashcode = c1.hashCode();
		int c2Hashcode = c2.hashCode();
		System.out.println(cHashcode+ " c2 hash code::"+c2Hashcode+" c1 hascode::"+c1Hashcode);
		String s = c.toString();
		String s1 = c1.toString();
		String s2 = c2.toString();
		System.out.println(s+" "+s1+" "+s2);
		
		c.show();
		c1.show();
		c2.show();
	}
	

}
