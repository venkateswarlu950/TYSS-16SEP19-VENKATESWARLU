package com.tyss.empspringmvc.dao;

import com.tyss.empspringmvc.dto.Employee;

public interface EmployeeDAO {
	
	public Employee login(int id, String password);
	public boolean register(Employee emp);
	public boolean deleteEmp(int id);
	public Employee serachEmp(int id);
	public int updateEmp(Employee emp);
	public boolean changePwd(Employee emp, String pwd);

}
