package com.thread.define;

public class TestThread {
	
	public static void main(String[] args) {
		
		System.out.println("main started");
		
		MyThread m1 = new MyThread();
		
		/*
		 * don't call the run method, it behaves like normal program all code will excute
		 * main thread only
		 * 
		 * m1.run();
		 */
		
		m1.start();
		/*
		 * m1.start(); illegal thread exception
		 */		
		for(int i =0; i<5;i++) {
			
			System.out.println("miidle of my thread");
		}
		
		System.out.println("main thread end");
		
		
	}

}
