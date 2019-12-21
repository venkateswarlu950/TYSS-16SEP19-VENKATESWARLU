package com.exceptions.second;

import java.util.Scanner;

public class TestC {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try(Scanner sc1 = new Scanner(System.in)) {
			System.out.println("enter age ");
			int age = sc1.nextInt();
			
			System.out.println("age is "+age);
			
			System.out.println(age/0);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("finally excuted");
		}
	}

}
