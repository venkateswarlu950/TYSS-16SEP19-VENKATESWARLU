package com.empapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.empapp.dto.EmployeeBean;

public class EmployeeDaoImpl {
	
	private int id;
	private String[] args;
	public ArrayList<EmployeeBean> getEmployeeData() {
		
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = " select * from employee_info ";
		Connection conn = null;
		Statement st = null;
		ResultSet res = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection(url);
			
			st = conn.createStatement();
			res = st.executeQuery(sql);
			
			ArrayList<EmployeeBean> result = new ArrayList<EmployeeBean>();
			
			while(res.next()) {
				
				EmployeeBean bean = new EmployeeBean();
				
				
				
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
