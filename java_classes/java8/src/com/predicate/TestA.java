package com.predicate;

import java.util.function.Predicate;

public class TestA {
	
	public static void main(String[] args) {
		
		Predicate<Teachers> p = s -> {
			if(s.salary > 9000) {
				return true;
			}else {
				return false;
			}
			
		};
		
		Teachers t = new Teachers(44, "rada", 10000);
		p.test(t);
		
		
		
	}

}
