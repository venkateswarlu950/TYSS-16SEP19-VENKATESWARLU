package com.tyss.stm.stockmanagementsystem.service;

import java.util.List;

import com.tyss.stm.stockmanagementsystem.dto.Order_Info;
import com.tyss.stm.stockmanagementsystem.dto.Product;

public interface ProductService {
	
	public boolean addProduct(Product product);
	public boolean updateProduct(Product product);
	public Product getProductById(int id);
	public Product getProductByName(String name);
	public List<Product> getProductByCatagory(String catagory);
	public List<Product> getAllProduct();
	public Product serachByComp(String comp);
	public boolean addOrder(List<Order_Info> order);

}
