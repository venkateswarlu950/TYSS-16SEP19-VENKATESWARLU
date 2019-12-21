package com.empapp.util;

import com.empapp.dao.EmployeeDao;
import com.empapp.dao.EmployeeDaoImpl;

public class EmployeeManager {
	
	private EmployeeManager () {}
	
	public static EmployeeDaoImpl getEmployeeDao () {
		return new EmployeeDaoImpl();
	}

}
