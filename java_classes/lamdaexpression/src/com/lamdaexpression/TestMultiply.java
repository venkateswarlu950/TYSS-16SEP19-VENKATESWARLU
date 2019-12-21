package com.lamdaexpression;

public class TestMultiply {

	public static void main(String[] args) {

		MultiplyInterface mi	= (a,b) -> a*b;

		int product = mi.multiply(14, 4);
		
		System.out.println(product);

	}

}
