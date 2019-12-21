package com.tyss.assestmanagement.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "asset_allocation")
public class AssestAllocation {

	@Id
	@GeneratedValue
	@Column
	private int allocation_id;
	@Column
	private int assestid;
	@Column
	private int empno;
	@Column
	private Date allocation_date;
	@Column
	private Date realse_date;
	
	public int getAllocation_id() {
		return allocation_id;
	}
	public void setAllocation_id(int allocation_id) {
		this.allocation_id = allocation_id;
	}
	
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public Date getAllocation_date() {
		return allocation_date;
	}
	public int getAssestid() {
		return assestid;
	}
	public void setAssestid(int assestid) {
		this.assestid = assestid;
	}
	public void setAllocation_date(Date allocation_date) {
		this.allocation_date = allocation_date;
	}
	public Date getRealse_date() {
		return realse_date;
	}
	public void setRealse_date(Date realse_date) {
		this.realse_date = realse_date;
	}
}
