package com.cg.demojpa.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.demojpa.dto.Employee;
import com.cg.demojpa.dto.Project;

public class EmployeeDaoImpl implements EmployeeDao{
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("demojpa");
	
	

	public Employee save(Employee emp) {
		// TODO Auto-generated method stub
		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction tran = em.getTransaction();
		Project pro=emp.getProj();
		tran.begin(); 
		//em.persist(pro);
		em.persist(emp); 	//em.flush or tran.commit
		
		em.flush();
		tran.commit();
		
		return null;
	}

	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		EntityManager em = entityManagerFactory.createEntityManager();
		Query query = em.createQuery("FROM Employee");
		
		List<Employee> empList = query.getResultList();
		return empList;
		
	}
	
	public List<Employee> findBetwSal(double min, double max) {
		// TODO Auto-generated method stub
		EntityManager em = entityManagerFactory.createEntityManager();
		Query query = em.createQuery("FROM Employee WHERE empSal BETWEEN :first AND :second");
		query.setParameter("first", min);
		query.setParameter("second", max);
			
		List<Employee> empList = query.getResultList();
		return empList;
		
	}

	public void remove(Integer empId) {
		// TODO Auto-generated method stub
		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction tran = em.getTransaction();
		Employee empRemove = em.find(Employee.class, empId);
		tran.begin();
		em.remove(empRemove);
		tran.commit();
		
	}

	public void updateEmpSal(int id,double sal) {
		// TODO Auto-generated method stub
		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction tran = em.getTransaction();
		Employee emp = em.find(Employee.class, id);
		tran.begin();
		emp.setEmpSal(sal);
		tran.commit();
		
	}

}
