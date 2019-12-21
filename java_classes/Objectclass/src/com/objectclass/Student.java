package com.objectclass;

public class Student {
	private int id;
	private String name;
	private double percentage;
	
	public Student(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	public void printDetails() {
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(percentage);
	}
	
	public int hashCode() {
		
		return id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}
	
	
	
	

}
