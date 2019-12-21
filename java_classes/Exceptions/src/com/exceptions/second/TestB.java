package com.exceptions.second;

import java.io.IOException;
import java.sql.SQLException;

public class TestB {
	
	public static void main(String[] args) {
		System.out.println("main started");
		
		FileTest ft = new FileTest();
		try {
			try {
				try {
					ft.open();
				} catch (SQLException e) { 
					e.printStackTrace();
				}
			} catch (ClassNotFoundException e) {
				System.out.println("found exception");
				e.printStackTrace();
			}
		} catch (IOException e) {
			System.out.println("exception caught");
			e.printStackTrace();
		}
		
		
		
		System.out.println("main ended");
	}

}
