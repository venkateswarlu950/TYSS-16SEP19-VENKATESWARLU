package com.tyss.springboot.dto;

import java.util.List;

public class EmployeeResponce {
	private int statusCode;
	private String msg;
	private String description;
	private List<EmployeeBean> listEmp;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<EmployeeBean> getListEmp() {
		return listEmp;
	}
	public void setListEmp(List<EmployeeBean> listEmp) {
		this.listEmp = listEmp;
	}
	
	
	

}
