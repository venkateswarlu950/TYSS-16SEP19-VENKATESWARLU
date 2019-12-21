package com.ustglobal.springmvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ustglobal.springmvc.beans.Employee;

@Controller
public class HelloController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		CustomDateEditor editor = new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class, editor);
		
		
	}
	
	
	@RequestMapping public String hello(@RequestParam("name") String name,@RequestParam("id") int id,
			ModelMap map) {
		map.addAttribute("msg","Hello World");
		map.addAttribute("name",name);
		map.addAttribute("id",id);
		return "index";
	}
	
	@RequestMapping(path="/hi/{name}/{id}")
	public String hi(@PathVariable("name") String name,@PathVariable("id") int id, HttpServletRequest request) {
		request.setAttribute("name", name);
		request.setAttribute("id", id);
		
		return "index";
	}
	
	@RequestMapping(path="/form")
	public String formPage() {
		
		
		return "form";
	}
	
	@RequestMapping(path="/form", method = RequestMethod.POST)
	public String form(Employee emp, ModelMap map) {
		
		
		map.addAttribute("id", emp.getId());
		map.addAttribute("name", emp.getName());
		map.addAttribute("pwd", emp.getPwd());
		map.addAttribute("gender",emp.getGen());
		map.addAttribute("doj", emp.getDoj());
		
		return "formDetailsView";
		
	}
	@RequestMapping(path = "/creat-cookie")
	public String createCookie(ModelMap map, HttpServletResponse resp) {
		Cookie ck = new Cookie("name", "divya");
		resp.addCookie(ck);
		
		return "createCookie";
	}
	
	@RequestMapping("/read-cookie")
	public String readCookie(ModelMap map, @CookieValue(name= "name", required = false) String name) {
		
		map.addAttribute("name", name);
		
		
		return "readcookie";
	}
	@RequestMapping(path="/redirect")
	public String redirect() {
		
		
		return "redirect: https://www.google.com";
		
	}
	
	@RequestMapping(path="/forward")
	public String forward() {
		
		
		
		return "forward:hi/venkat/12";
	}
}
