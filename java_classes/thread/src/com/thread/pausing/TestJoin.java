package com.thread.pausing;

public class TestJoin {
	
	public static void main(String[] args) {
		
		System.out.println("main started");
		
		MyJoinThread t = new MyJoinThread();
		t.start();
	   try {
		t.join(5000);
		
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
		
	for(int i=0;i<5;i++) {
		System.out.println("main thread");
	}
	System.out.println("main end");
		
	}

}
