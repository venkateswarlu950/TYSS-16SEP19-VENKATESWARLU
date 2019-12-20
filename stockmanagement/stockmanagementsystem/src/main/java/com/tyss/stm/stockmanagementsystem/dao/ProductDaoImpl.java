package com.tyss.stm.stockmanagementsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.tyss.stm.stockmanagementsystem.dto.Order_Info;
import com.tyss.stm.stockmanagementsystem.dto.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	
	@PersistenceUnit
	private EntityManagerFactory factory;
	@Override
	public boolean addProduct(Product product) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(product);
			transaction.commit();
			return true;
		}catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean updateProduct(Product product) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Product p = manager.find(Product.class, product.getId());
			p.setCatg(product.getCatg());
			p.setName(product.getName());
			p.setQuantity(product.getQuantity());
			p.setPrice(product.getPrice());
			transaction.commit();
			return true;
		}catch (Exception e) {
			return false;
		}
	}

	

	@Override
	public Product getProductById(int id) {
		EntityManager manager = factory.createEntityManager();
		return manager.find(Product.class, id);
	}

	@Override
	public Product getProductByName(String name) {
		System.out.println("name in dao::"+name);
		EntityManager manager = factory.createEntityManager();
		try {
			String jpql = "from Product where name=:name";
			TypedQuery<Product> typedQuery = manager.createQuery(jpql, Product.class);
			typedQuery.setParameter("name", name);
			Product product = typedQuery.getSingleResult();
			System.out.println("product::"+product);
			return product;
		}catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<Product> getProductByCatagory(String catagory) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Product where catg=:catg";
		TypedQuery<Product> typedQuery = manager.createQuery(jpql, Product.class);
		typedQuery.setParameter("catogory", catagory);
		return typedQuery.getResultList();
	}

	@Override
	public List<Product> getAllProduct() {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Product";
		TypedQuery<Product> typedQuery = manager.createQuery(jpql, Product.class);
		return typedQuery.getResultList();
	}


	@Override
	public Product searchByComp(String comp) {
		EntityManager manager = factory.createEntityManager();
		try {
			String jpql = "from Product where comp=:comp";
			TypedQuery<Product> typedQuery = manager.createQuery(jpql, Product.class);
			typedQuery.setParameter("comp", comp);
			Product product = typedQuery.getSingleResult();
			return product;
		}catch (Exception e) {
			return null;
		}
	}

	@Override
	public boolean addOrder(List<Order_Info> order) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
	     Product product = new Product();
	    		 product.setOrder(order);
		try {
			transaction.begin();
			manager.persist(product);
			transaction.commit();
			return true;
		}catch (Exception e) {
			return false;
		}

	}
}
