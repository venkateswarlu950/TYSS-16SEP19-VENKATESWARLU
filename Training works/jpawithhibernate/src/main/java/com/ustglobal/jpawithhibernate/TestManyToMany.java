package com.ustglobal.jpawithhibernate;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.manytomany.Courses;
import com.ustglobal.jpawithhibernate.manytomany.Student;

public class TestManyToMany {
	
	public static void main(String[] args) {
		
		Courses c = new Courses();
		c.setCid(470);
		c.setCname("java");
		
		Courses c1 = new Courses();
		c1.setCid(493);
		c1.setCname("sql");
		
		Courses c2 = new Courses();
		c2.setCid(457);
		c2.setCname("dotnet");
		
		ArrayList<Courses> list = new ArrayList<Courses>();
		list.add(c);
		list.add(c1);
		list.add(c2);
		
		//System.out.println(list);
		Student st = new Student();
		st.setSid(1);
		st.setSname("Reddy");
		st.setCourses(list);
		
		Student st1 = new Student();
		st1.setSid(2);
		st1.setSname("Sushmi");
		st1.setCourses(list);
		
		
		EntityManager entityManger = null;
		EntityTransaction entityTransaction =null;


		try {
			EntityManagerFactory entityMangerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManger = entityMangerFactory.createEntityManager();
			entityTransaction = entityManger.getTransaction();
			entityTransaction.begin();

			entityManger.persist(st);
			entityManger.persist(st1);

			System.out.println("Record Saved");
			entityTransaction.commit();

		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();

		}
		entityManger.close();
		
		
		
	}

}
