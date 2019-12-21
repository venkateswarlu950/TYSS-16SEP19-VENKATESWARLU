package com.tyss.assestmanagement.dto;

import java.util.List;

public class Response {


	private int statusCode;
	private String message;
	private String desc;
	private List<Assest> assests;
	private String usertype;
	

	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public List<Assest> getAssests() {
		return assests;
	}
	public void setAssests(List<Assest> assests) {
		this.assests = assests;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
