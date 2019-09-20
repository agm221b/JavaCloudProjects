package com.cg.employeemanagement.dao;

import com.cg.employeemanagement.dto.Employee;

public interface EmployeeDao {
	
	public Employee addEmployee(Employee emp);
	
	public Employee[] showEmployee();
	
	public Employee searchEmployee(long eid);
	
	public void removeEmployee(long eid);
	
	public Employee updateEmployee(long eid, String name, double sal, long did, String dname);
	

}
