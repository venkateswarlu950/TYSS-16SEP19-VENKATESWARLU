package com.objectclass;

public class Employee {
	
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() {
		
		return id+" "+name+" "+salary;
	}
	public boolean equals(Object obj) {
	Employee e = (Employee)obj;
	if(this.id == e.id) {
		return true;
		
	}else {
		return false;
	}
	}

}
