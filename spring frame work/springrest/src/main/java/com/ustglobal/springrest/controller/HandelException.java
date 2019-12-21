package com.ustglobal.springrest.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ustglobal.springrest.dto.EmployeeBean;
import com.ustglobal.springrest.dto.EmployeeResponce;

@RestControllerAdvice
public class HandelException {
	
	@ExceptionHandler(Exception.class)
	public EmployeeResponce getException() {
	
	EmployeeResponce resp1 = new EmployeeResponce();
		resp1.setStatusCode(501);
		resp1.setMsg("error in code");
		resp1.setDescription("got error in code");
		
		return resp1;
	}
	
	

}

