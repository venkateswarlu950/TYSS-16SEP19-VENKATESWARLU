package com.hasarelation.weak;

public class TestB {
	
	public static void main(String[] args) {
		
		Car c = new Car();
		System.out.println("car brand name::"+c.brand);
		c.engine();
		c.speed();
		System.out.println("calling music by car value ::"+c.m.type);
		c.m.song();
	}

}
