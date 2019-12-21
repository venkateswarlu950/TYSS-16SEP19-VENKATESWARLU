package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.onetoone.Person;
import com.ustglobal.jpawithhibernate.onetoone.Voter_Card;

public class TestOneToOne {
	
	public static void main(String[] args) {
		
		Voter_Card vc = new  Voter_Card();
		vc.setVid(10);
		vc.setVname("Ram");
		
		Person p = new  Person();
		p.setPid(1);
		p.setPname("Ram");
		p.setVoter(vc);
		
		
		EntityManager entityManger = null;
		EntityTransaction entityTransaction =null;
		
		
		try {
			EntityManagerFactory entityMangerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManger = entityMangerFactory.createEntityManager();
			entityTransaction = entityManger.getTransaction();
			entityTransaction.begin();
			
			Voter_Card voter =	entityManger.find(Voter_Card.class, 10);
			System.out.println(voter.getPerson().getPid());
			System.out.println(voter.getPerson().getPname());


			//entityManger.persist(p);
			System.out.println("Record Saved");
			entityTransaction.commit();

		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();

		}
		    entityManger.close();

	}

}
