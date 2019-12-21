package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.ProductInfo;

public class GetReference {
	
	public static void main(String[] args) {


		
			EntityManagerFactory entityMangerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			EntityManager entityManger = entityMangerFactory.createEntityManager();
			ProductInfo productInfo =	entityManger.getReference(ProductInfo.class,103);
			//ProductInfo productInfo =	entityManger.find(ProductInfo.class,104); null pointer exception
		//ProductInfo productInfo =	entityManger.getReference(ProductInfo.class,104); null pointer exception
			System.out.println("ID is:"+productInfo.getPid());
			System.out.println("Name is:"+productInfo.getPname());
			System.out.println("Quantity is:"+productInfo.getQuantity());
			entityManger.close();

	}


}
