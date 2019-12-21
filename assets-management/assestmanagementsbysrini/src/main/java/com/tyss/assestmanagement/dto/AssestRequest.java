package com.tyss.assestmanagement.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "assest_request")
public class AssestRequest {

	@Id
	@GeneratedValue
	@Column
	private int requestid;
	@Column
	private String assestname;
	@Column
	private int empno;
	
	public int getRequestid() {
		return requestid;
	}
	public void setRequestid(int requestid) {
		this.requestid = requestid;
	}
	public String getAssestname() {
		return assestname;
	}
	public void setAssestname(String assestname) {
		this.assestname = assestname;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	
	
}
