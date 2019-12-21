package com.thread.properties;

public class MyPriorityThread extends Thread {
	
	public static void main(String[] args) {
		
		System.out.println("main started");
		
		int p = Thread.currentThread().getPriority();
		
		System.out.println("main thread priority "+p);
		
		Thread.currentThread().setPriority(6);
		
		MyPriorityThread mp = new MyPriorityThread();
		
		int mp1 = mp.getPriority();
		
		System.out.println(mp1);
		
		mp.setPriority(4);
		
		System.out.println("main end");
	}

}
