package com.hasarelation.weak;

import java.util.Scanner;

public class TestF {
	
	public static void main(String[] args) {
		
		System.out.println("scanner class");
		
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("enter age");
	     int age = sc.nextInt();
	     System.out.println("age is "+age);
	     
	     System.out.println("are you male?");
	     boolean a = sc.nextBoolean();
	     System.out.println(a);
	     
	     sc.close();
		
	}

}
