package com.thread.pausing;

public class TestThread {
	
	public static void main(String[] args) {
		System.out.println("main started");
		
		MyThread m1 = new MyThread();
		m1.start();
		
		for(int i =0; i<10; i++) {
			
			System.out.println("main thread");
			
		}
		System.out.println("main end");

	}

}
