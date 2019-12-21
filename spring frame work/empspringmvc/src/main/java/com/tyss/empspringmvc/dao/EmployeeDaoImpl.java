package com.tyss.empspringmvc.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.empspringmvc.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDAO {
	
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee-unit");

	@Override
	public Employee login(int id, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean register(Employee emp) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		try {
		em.persist(emp);
		et.commit();
		return true;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return false;
	}

	@Override
	public boolean deleteEmp(int id) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Employee emp = em.find(Employee.class, id);
		em.remove(emp);
		et.commit();
		
		
		return true;
	}

	@Override
	public Employee serachEmp(int id) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		return null;
	}

	@Override
	public int updateEmp(Employee emp) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		return 0;
	}

	@Override
	public boolean changePwd(Employee emp, String pwd) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	

}
