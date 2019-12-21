package com.thread.properties;

public class MyIdThread extends Thread
{
	
	public static void main(String[] args) {
		
		System.out.println("main started");
		
		System.out.println(Thread.currentThread().getId());
		
		MyIdThread id = new MyIdThread();
		
		long id1 = id.getId();
		
		System.out.println(id1);
		
		System.out.println(Thread.currentThread().getPriority());
		
//		System.out.println(Thread.currentThread().setPriority(16));
		
		System.out.println("main end");
	}

}
