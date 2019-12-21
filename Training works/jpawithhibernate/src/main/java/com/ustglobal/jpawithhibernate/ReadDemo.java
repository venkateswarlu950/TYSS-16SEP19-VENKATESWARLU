package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.ProductInfo;

public class ReadDemo {
	public static void main(String[] args) {
		EntityManagerFactory entityMangerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManger = entityMangerFactory.createEntityManager();

		ProductInfo productDetail=	entityManger.find(ProductInfo.class,101);
		System.out.println("ID is:"+productDetail.getPid());
		System.out.println("Name is:"+productDetail.getPname());
		System.out.println("Quantity is:"+productDetail.getQuantity());
		entityManger.close();
	}

}
