package com.sorting.list;

import java.util.LinkedList;

public class TestC {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> l = new LinkedList<Integer>();
		
		l.add(4);
		l.add(3);
		l.add(8);
		l.add(2);
		
		Integer peekEl = l.peek();
		System.out.println(peekEl);
		Integer peekFirst = l.peekFirst();
		System.out.println(peekFirst);
		Integer peekLast = l.peekLast();
		System.out.println(peekLast);
		
		
		System.out.println("after peek operation ");
		
		Integer pollEl = l.poll();
		System.out.println(pollEl);
		Integer pollFirst = l.pollFirst();
		System.out.println(pollFirst);
		Integer pollLast = l.pollLast();
		System.out.println(pollLast);
		
		
		l.push(12);
		System.out.println("after push ::"+l);
		Integer p = l.pop();
		
		System.out.println(p);
		System.out.println("after pop ::"+l);
		
		
	}
	

}
