package com.tyss.stm.stockmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.stm.stockmanagementsystem.dao.ProductDao;
import com.tyss.stm.stockmanagementsystem.dto.Order_Info;
import com.tyss.stm.stockmanagementsystem.dto.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao dao;
	
	@Override
	public boolean addProduct(Product product) {
		return dao.addProduct(product);
	}

	@Override
	public boolean updateProduct(Product product) {
		return dao.updateProduct(product);
	}
	@Override
	public Product getProductById(int id) {
		return dao.getProductById(id);
	}

	@Override
	public Product getProductByName(String name) {
		return dao.getProductByName(name);
	}

	@Override
	public List<Product> getProductByCatagory(String catagory) {
		return dao.getProductByCatagory(catagory);
	}

	@Override
	public List<Product> getAllProduct() {
		return dao.getAllProduct();
	}

	
	@Override
	public Product serachByComp(String comp) {
		// TODO Auto-generated method stub
		return dao.searchByComp(comp);
	}

	@Override
	public boolean addOrder(List<Order_Info> order) {
		// TODO Auto-generated method stub
		return dao.addOrder(order);
	}


}
