package com.thread.properties;

public class MyThread extends Thread {

	public static void main(String[] args) {

		System.out.println("main started");

		String name = Thread.currentThread().getName();
		System.out.println(name);

		MyThread m1 = new MyThread();
		System.out.println(m1.getName());
		m1.setName("bala");
		System.out.println(m1.getName());


		Thread.currentThread().setName("solo");

		System.out.println(10/0);

		System.out.println("main end");
		
	}

}
