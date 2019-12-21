package com.thread.pausing;

public class MyJoinThread extends Thread {
	
	public void run() {
		
		for(int i=0;i<5;i++) {
			
			System.out.println("child join thread");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
