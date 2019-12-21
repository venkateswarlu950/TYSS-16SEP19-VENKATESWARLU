package com.singleton;

public class MySingleton {
	
	private static MySingleton ms = null;
	public String s;
	
	private MySingleton() {
		
		
	}
	
	public static MySingleton getDbConnection() {
		System.out.println(ms);
		
		if(ms == null) {
			System.out.println("in if condition");
			 ms = new MySingleton();
			
			return ms;
			
		}else {
			System.out.println("in else");
			return ms;
		}
		
	}

}
