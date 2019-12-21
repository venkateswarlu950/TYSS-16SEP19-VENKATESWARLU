package com.lamdaexpression;

public class TestAdd implements AddInterface {

	public static void main(String[] args) {

		TestAdd t = new TestAdd();
		int sum =t.add(10, 12);
		System.out.println(sum);

	}

	@Override
	public int add(int a, int b) {

		return a*b;


	}

}
