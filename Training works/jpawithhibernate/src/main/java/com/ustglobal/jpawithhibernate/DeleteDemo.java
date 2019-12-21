package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.ProductInfo;

public class DeleteDemo {
	public static void main(String[] args) {


		EntityManager entityManger = null;
		EntityTransaction entityTransaction =null;
		try {
			EntityManagerFactory entityMangerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManger = entityMangerFactory.createEntityManager();
			entityTransaction = entityManger.getTransaction();
			entityTransaction.begin();
			ProductInfo productInfo =	entityManger.find(ProductInfo.class,101);
			entityManger.remove(productInfo);
			System.out.println("Delete Record");
			entityTransaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManger.close();

	}


}
