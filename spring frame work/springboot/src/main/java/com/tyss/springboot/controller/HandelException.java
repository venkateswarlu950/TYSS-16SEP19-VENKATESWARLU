package com.tyss.springboot.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.tyss.springboot.dto.EmployeeResponce;

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

