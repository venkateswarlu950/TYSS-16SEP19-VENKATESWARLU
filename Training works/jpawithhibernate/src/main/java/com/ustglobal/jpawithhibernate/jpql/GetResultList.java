package com.ustglobal.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernate.dto.ProductInfo;

public class GetResultList {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		//String jpql="from ProductInfo";
		String jpql = "select pname from ProductInfo ";
		Query query = entityManager.createQuery(jpql);
		
		//List <ProductInfo> li =	query.getResultList();
		//	  for (ProductInfo product : li) {
		//		  System.out.println("ID is:"+product.getPid());
		//			System.out.println("Name is:"+product.getPname());
		//			System.out.println("Quantity is:"+product.getQuantity());
		//			System.out.println("=================================");
		//		  
		//	  }
		
		List<String> list = query.getResultList();
		for(String  product : list) {
				System.out.println(product);
				System.out.println("==========");

		}
		
		
		entityManager.close();
	}

}
