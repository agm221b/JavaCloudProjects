package com.cg.demojpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.cg.demojpa.dto.Employee;

public interface EmployeeDao {
	
	public Employee save(Employee emp);
	public List<Employee> findAll();
	public List<Employee> findBetwSal(double min, double max);
	public void remove(Integer empId);
	public void updateEmpSal(int id,double sal);
}
