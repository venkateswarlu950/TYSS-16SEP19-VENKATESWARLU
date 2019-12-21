package com.ustglobal.springrest.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.springrest.dto.EmployeeBean;
import com.ustglobal.springrest.dto.EmployeeResponce;
import com.ustglobal.springrest.services.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService Service;
	
	@PostMapping(path = "/add" ,
					consumes = MediaType.APPLICATION_JSON_VALUE,
					produces = MediaType.APPLICATION_JSON_VALUE )
	public EmployeeResponce addEmployee( @RequestBody  EmployeeBean bean) {
		EmployeeResponce resp = new EmployeeResponce();
		if(Service.addEmployee(bean)) {
			resp.setStatusCode(201);
			resp.setMsg("sucess");
			resp.setDescription("data added to the db");
			
		}else {
			
			resp.setStatusCode(401);
			resp.setMsg("failur");
			resp.setDescription("data not added to the db");
			
			
		}
		
		return resp;
		
	}//end of addEmployee()
	
	
	@PutMapping(path = "/modify",
					consumes = MediaType.APPLICATION_JSON_VALUE,
					produces = MediaType.APPLICATION_JSON_VALUE)
	
	public EmployeeResponce modifyEmployee(@RequestBody EmployeeBean bean) {
		EmployeeResponce resp = new EmployeeResponce();
		if(Service.modifyEmployee(bean)) {
			resp.setStatusCode(201);
			resp.setMsg("sucess");
			resp.setDescription("data modify to the db");
			
		}else {
			
			resp.setStatusCode(401);
			resp.setMsg("failur");
			resp.setDescription("data not modify to the db");
			
			
		}
		
		return resp;
	}// end of modifyEmployee()
	
	@DeleteMapping(path = "/delete/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	
	public EmployeeResponce deleteEmployee(@PathVariable("id") int id) {
		
		EmployeeResponce resp1 = new EmployeeResponce();
		if(Service.deleteEmployee(id)) {
			resp1.setStatusCode(201);
			resp1.setMsg("sucess");
			resp1.setDescription("data delete to the db");
			
		}else {
			
			resp1.setStatusCode(401);
			resp1.setMsg("failur");
			resp1.setDescription("data not delete to the db");
			
			
		}
		
		return resp1;
	} // end of deleteEmployee()
	
	@GetMapping(path = "/get",produces = MediaType.APPLICATION_JSON_VALUE)
	
	public EmployeeResponce getEmployee(@RequestParam("id") int id) {
		EmployeeResponce resp1 = new EmployeeResponce();
		EmployeeBean bean = Service.getEmployee(id);
		if(bean != null) {
			resp1.setStatusCode(201);
			resp1.setMsg("sucess");
			resp1.setDescription("data found to the db");
			resp1.setListEmp(Arrays.asList(bean));
			
		}else {
			
			resp1.setStatusCode(401);
			resp1.setMsg("failur");
			resp1.setDescription("data not found to the db");
			
			
		}
		
		return resp1;
	} // end of getEmployee()
	
	@GetMapping(path = "get-all",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponce getAllEmployee(){
		
		EmployeeResponce resp1 = new EmployeeResponce();
		List<EmployeeBean> beans = Service.getAllEmployee();
		if(!beans.isEmpty()) {
			resp1.setStatusCode(201);
			resp1.setMsg("sucess");
			resp1.setDescription("data found to the db");
			resp1.setListEmp(beans);
			
		}else {
			
			resp1.setStatusCode(401);
			resp1.setMsg("failur");
			resp1.setDescription("data not found to the db");
			
			
		}
		
		
		return resp1;
		
	}// end of getAllEmployee()
	@GetMapping(path = "/exce", produces = MediaType.APPLICATION_JSON_VALUE)
	public void createException() {
		
		int i = 1/0;
	}

	
	
	

}// end of EmployeeController
