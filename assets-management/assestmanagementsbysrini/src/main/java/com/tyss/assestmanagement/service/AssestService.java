package com.tyss.assestmanagement.service;

import java.util.List;
import java.util.Optional;

import com.tyss.assestmanagement.dto.Assest;
import com.tyss.assestmanagement.dto.AssestAllocation;
import com.tyss.assestmanagement.dto.AssestRequest;
import com.tyss.assestmanagement.dto.EmployeeBean;
import com.tyss.assestmanagement.dto.UserBean;

public interface AssestService {

	public UserBean login(int userId,String password);
	public boolean addAssest(Assest assest);
	public boolean modifyAssest(Assest assest);
	public List<Assest> getAssests(String status);
	public boolean addEmployee(EmployeeBean bean);
	public boolean raiseRequest(AssestRequest assestRequest);
	public List<AssestRequest> getAllRequset();
	public boolean allocateAsset(AssestAllocation assestAllocation);
	
}
