package com.lamdaexpression;

public class TestFactorial {
	
	public static void main(String[] args) {
		
		FactorialInterface ft = (n) -> {
			
			int fact = 1;
			for(int i=2;i<=n;i++) {
				fact = fact*i;
			}
			return fact;
		};
		int fat = ft.factorial(5);
		System.out.println(fat);
		
	}

}
