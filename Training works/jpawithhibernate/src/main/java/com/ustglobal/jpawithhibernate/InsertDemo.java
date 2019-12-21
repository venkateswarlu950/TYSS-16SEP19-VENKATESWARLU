package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.ProductInfo;

public class InsertDemo {

	public static void main(String[] args) {
		// Transisent stage 1:
		ProductInfo productInfo = new ProductInfo();
		productInfo.setPid(493);
		productInfo.setPname("vivo");
		productInfo.setQuantity(4);

		EntityManager entityManger = null;
		EntityTransaction entityTransaction =null;
		
			//Persistant stage 2:
		
		try {
			EntityManagerFactory entityMangerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManger = entityMangerFactory.createEntityManager();
			entityTransaction = entityManger.getTransaction();
			entityTransaction.begin();
			entityManger.persist(productInfo);
			System.out.println("Record Saved");
			entityTransaction.commit();

		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();

		}
		    entityManger.close();


	}

}
