package com.collectionframework.list;

public class Student {
	
	int id;
	String name;
	double per;
	
	
	public Student(int id, String name, double per) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", per=" + per + "]";
	}
	
	
	

}
