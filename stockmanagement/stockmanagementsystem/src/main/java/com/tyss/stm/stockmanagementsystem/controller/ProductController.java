package com.tyss.stm.stockmanagementsystem.controller;

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

import com.tyss.stm.stockmanagementsystem.dto.Order_Info;
import com.tyss.stm.stockmanagementsystem.dto.Product;
import com.tyss.stm.stockmanagementsystem.service.ProductService;

@CrossOrigin(origins = "*", allowedHeaders = "*" , allowCredentials = "true")
@RestController
public class ProductController {
	
	
	@Autowired
	private ProductService service;
	
	@PostMapping(path="/save",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean addProduct(@RequestBody Product product) {
		
		return service.addProduct(product);
	}
	
	@PutMapping(path="/updateProduct", 
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean update(@RequestBody Product pro) {
		
		return service.updateProduct(pro);
	}
	
	@GetMapping(path="/searchName/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Product searchByName(@PathVariable("name") String name) {
		System.out.println("name::"+name);
		
		return service.getProductByName(name);
	}
	
	@GetMapping(path="/searchCatg", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> searchByCatg(@RequestParam("catg") String catg) {
		
		return service.getProductByCatagory(catg);
	}
	
	@GetMapping(path="searchComp", produces = MediaType.APPLICATION_JSON_VALUE)
	public Product searchByComp(@RequestParam("comp") String comp) {
		
		return service.serachByComp(comp);
	}
	
	@PostMapping(path="orderSave", consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean order(@RequestBody List<Order_Info> order) {
		
		return service.addOrder(order);
	}
	
	@GetMapping(path="/getProduts", 
			produces = MediaType.APPLICATION_JSON_VALUE )
	public List<Product> getDeatils(){
		
		return service.getAllProduct();
	}
	
	

}
