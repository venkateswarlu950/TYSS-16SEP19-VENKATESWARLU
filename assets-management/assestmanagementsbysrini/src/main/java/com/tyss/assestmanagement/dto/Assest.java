package com.tyss.assestmanagement.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "assest")
public class Assest {

	@Id
	@GeneratedValue
	@Column
	private int assestid;
	@Column
	private String assestname;
	@Column
	private String assesdesc;
	@Column
	private int quantity;
	@Column
	private String status;
	public int getAssestid() {
		return assestid;
	}
	public void setAssestid(int assestid) {
		this.assestid = assestid;
	}
	public String getAssestname() {
		return assestname;
	}
	public void setAssestname(String assestname) {
		this.assestname = assestname;
	}
	public String getAssesdesc() {
		return assesdesc;
	}
	public void setAssesdesc(String assesdesc) {
		this.assesdesc = assesdesc;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
