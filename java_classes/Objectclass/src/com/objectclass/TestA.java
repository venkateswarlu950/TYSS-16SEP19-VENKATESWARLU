package com.objectclass;

public class TestA {
	
	public static void main(String[] args) {
		
		Mouse m = new Mouse();
		Usbport.connect(m);
		
		
		Pendrive p = new Pendrive();
		Usbport.connect(p);
		
	}

}
