package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.onetomany.Pencil;
import com.ustglobal.jpawithhibernate.onetomany.PencilBox;

public class TestManyToOne {

	public static void main(String[] args) {

		PencilBox pb = new  PencilBox();
		pb.setBid(20);
		pb.setBname("nataraj");

		Pencil p = new Pencil();
		p.setPid(3);
		p.setPcolor("red");
		p.setPencilBox(pb);

		Pencil p1 = new Pencil();
		p1.setPid(4);
		p1.setPcolor("black");
		p1.setPencilBox(pb);

		EntityManager entityManger = null;
		EntityTransaction entityTransaction =null;


		try {
			EntityManagerFactory entityMangerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManger = entityMangerFactory.createEntityManager();
			entityTransaction = entityManger.getTransaction();
			entityTransaction.begin();

			PencilBox pb1 =	entityManger.find(PencilBox.class,10);
			System.out.println(pb1.getPencil().get(0));

			//entityManger.persist(p);
			//entityManger.persist(p1);

			System.out.println("Record Saved");
			entityTransaction.commit();

		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();

		}
		entityManger.close();
	}

}
