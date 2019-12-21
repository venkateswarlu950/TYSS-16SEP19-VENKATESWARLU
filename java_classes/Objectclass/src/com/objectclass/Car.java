package com.objectclass;

public class Car {
	
	private int cost;
	private String brand;
	private String color;
	
	
	public Car(int cost, String brand, String color) {
		super();
		this.cost = cost;
		this.brand = brand;
		this.color = color;
	}
	
	public void show() {
		System.out.println(cost);
		System.out.println(brand);
		System.out.println(color);
	}
	public int hasCode() {
		
		return cost;
	}
	
	public String toString() {
		
		return brand+" "+color;
	}
	
	
	

}
