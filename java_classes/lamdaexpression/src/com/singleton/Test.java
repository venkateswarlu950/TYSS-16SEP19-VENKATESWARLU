package com.singleton;

public class Test {
	
	public static void main(String[] args) {
		
		MySingleton instance = MySingleton.getDbConnection();
		
		System.out.println(instance);
		
		instance.s = "hello";
		
		System.out.println("hash code of ms::"+instance.hashCode());
		
		MySingleton instance1 = MySingleton.getDbConnection();
		System.out.println(instance1);
		
		instance1.s = "hi";
		
		System.out.println("has code of mx::"+instance1.hashCode());
		
		
	}

}
