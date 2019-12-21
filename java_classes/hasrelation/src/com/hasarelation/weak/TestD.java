package com.hasarelation.weak;

public class TestD {
	public static void main(String[] args) {
		
		
		Employees e = new Employees();
		e.setName("venkat");
		e.setSalary(20000);
		e.setDept(1524);
		e.setDesg("btech");
		Empdatabase ed = new Empdatabase();
		ed.show(e);
		
		

		
	}
	
	
	

}
