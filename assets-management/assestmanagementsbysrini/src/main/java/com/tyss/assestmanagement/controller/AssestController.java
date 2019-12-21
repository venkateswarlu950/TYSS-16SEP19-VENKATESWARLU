package com.tyss.assestmanagement.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.assestmanagement.dto.Assest;
import com.tyss.assestmanagement.dto.AssestAllocation;
import com.tyss.assestmanagement.dto.AssestRequest;
import com.tyss.assestmanagement.dto.EmployeeBean;
import com.tyss.assestmanagement.dto.Response;
import com.tyss.assestmanagement.dto.UserBean;
import com.tyss.assestmanagement.service.AssestService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AssestController {

	@Autowired
	private AssestService service;
	
	@PostMapping(path = "/addassest", 
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Response addAssest(@RequestBody Assest assest) {
		
		Response response = new Response();
		if(service.addAssest(assest)) {
			response.setStatusCode(201);
			response.setMessage("sucess");
			response.setDesc("Data added to the database");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDesc(" failed to add data to the database");
		}
		
		return response;
		
		
	}//end of addasest
	
	@GetMapping(path = "/getassest{status}", 
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Response getAssests(@PathVariable("status") String status) {
		Response response = new Response();
		List<Assest> bean = service.getAssests(status);
		if(bean!=null) {
			response.setStatusCode(201);
			response.setMessage("sucess");
			response.setDesc("Data found in the database");
			response.setAssests(bean);
		
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDesc("unable to find data ");
		}
		
		return response;
		
		
	}//end of getassests

	@PutMapping(path = "/modifyassest",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Response modifyAssest(@RequestBody Assest assest) {

		Response response = new Response();
		if(service.modifyAssest(assest)) {
			response.setStatusCode(201);
			response.setMessage("sucess");
			response.setDesc("Data modified in the database");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDesc(" failed to modify the data");
		}
		
		return response;

	
	}//end of modify

	@PostMapping(path = "/addemployee", 
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Response addeEmployee(@RequestBody EmployeeBean bean) {
		
		Response response = new Response();
		if(service.addEmployee(bean)) {
			response.setStatusCode(201);
			response.setMessage("sucess");
			response.setDesc("Employee Data added to the database");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDesc(" failed to add Employee data to the database");
		}
		
		return response;
		
		
	}//end of addasest
	@PostMapping(path = "/login", 
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Response login(@RequestParam("userId") int userId, 
			@RequestParam("password") String password) {
		
		Response response = new Response();
		UserBean bean=service.login(userId, password);
		String usertype =bean.getUserType();
		if(bean!=null &&userId==bean.getUserId()&&password.equals(bean.getPassword())) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDesc("login successfull");
			response.setUsertype(usertype);
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDesc("Invalid credentials");
		}
		
		 
		 return response;
	}
	
	@PostMapping(path = "/raiserequest", 
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Response raiseRequest(@RequestBody AssestRequest assestRequest) {
		
		Response response = new Response();
		if(service.raiseRequest(assestRequest)) {
			response.setStatusCode(201);
			response.setMessage("sucess");
			response.setDesc("Data added to the database");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDesc(" failed to add data to the database");
		}
		
		return response;
	}//end of raise request
	
	@PostMapping(path = "/assetallocate", 
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Response allocateAsset(@RequestBody AssestAllocation assestAllocation) {
		
		Response response = new Response();
		if(service.allocateAsset(assestAllocation)) {
			response.setStatusCode(201);
			response.setMessage("sucess");
			response.setDesc("Data added to the database");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDesc(" failed to add data to the database");
		}
		
		return response;
	}
	
	
	
	
	
}
