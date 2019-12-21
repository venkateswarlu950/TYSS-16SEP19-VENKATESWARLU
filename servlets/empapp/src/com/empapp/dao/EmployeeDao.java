package com.empapp.dao;

import java.util.ArrayList;

import com.empapp.dto.EmployeeBean;

public interface EmployeeDao {
	
	public ArrayList<EmployeeBean> getAllEmployeeData();
	public EmployeeBean searchEmployeeData(int id);
	public int insertEmployeeData(EmployeeBean bean);
	public int updateEmployeeData(EmployeeBean beanUpd);
	public int deleteEmployee(int id);

}
