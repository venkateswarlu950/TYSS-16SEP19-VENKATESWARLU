package com.sorting.list;

public class Laptop implements Comparable<Laptop> {
	
	double price;
	int ram;
	String name;
	public Laptop(double price, int ram, String name) {
		super();
		this.price = price;
		this.ram = ram;
		this.name = name;
	}
//	@Override
//	public int compareTo(Laptop l) {
//		Integer a = this.ram;
//		Integer b = l.ram;
//		
//		return a.compareTo(b);
//	}
	@Override
	public int compareTo(Laptop o) {
		Double d = this.price;
		Double d1 = o.price;
		
		return d.compareTo(d1);
	}
	
	
	
	
	

}
