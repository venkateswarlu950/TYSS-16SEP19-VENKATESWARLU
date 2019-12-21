package com.tyss.assestmanagement.service;

import java.lang.annotation.Annotation;
import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.assestmanagement.dto.Assest;
import com.tyss.assestmanagement.dto.AssestAllocation;
import com.tyss.assestmanagement.dto.AssestRequest;
import com.tyss.assestmanagement.dto.EmployeeBean;
import com.tyss.assestmanagement.dto.UserBean;
import com.tyss.assestmanagement.repo.AssestAllocationRepo;
import com.tyss.assestmanagement.repo.AssestRepo;
import com.tyss.assestmanagement.repo.AssestRequestRepo;
import com.tyss.assestmanagement.repo.EmployeeRepo;
import com.tyss.assestmanagement.repo.UserRepo;

@Service
public class ServiceImpl implements AssestService {

	
	
	@Autowired
	private EmployeeRepo repo;
	@Autowired
	private AssestRepo repo1;
	@Autowired
	private UserRepo userreop;
	@Autowired
	private EmployeeRepo empReop;
	@Autowired
	private AssestRequestRepo assestrepo;
	@Autowired
	private AssestAllocationRepo assetAllocateRepo;
	
	
	@Override
	public boolean allocateAsset(AssestAllocation assestAllocation) {
		assetAllocateRepo.save(assestAllocation);
		return true;
	}
	

	@Override
	public UserBean login(int userId, String password) {
		
		return userreop.findById(userId).get();
		 
	}

	@Override
	public boolean addAssest(Assest assest) {
		
		repo1.save(assest);
		return true;
	
	}

	@Override
	public boolean modifyAssest(Assest assest) {
		repo1.update(assest.getAssestname(), assest.getAssesdesc(), assest.getQuantity(), assest.getStatus(), assest.getAssestid());
		return true;
	}

	@Override
	public List<Assest> getAssests(String status) {
		
		return  repo1.findAll();
	}

	@Override
	public boolean addEmployee(EmployeeBean bean) {
		empReop.save(bean);
		return true;
	}

	@Override
	public boolean raiseRequest(AssestRequest assestRequest) {
		 assestrepo.save(assestRequest);
		 
		return true;
	}

	@Override
	public List<AssestRequest> getAllRequset() {
		
		return assestrepo.findAll();
	}
	
	



	}

