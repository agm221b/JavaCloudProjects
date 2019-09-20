package com.cg.employeemanagement.service;

import com.cg.employeemanagement.dto.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee emp);
	
	public Employee[] showEmployee();
	
	public void removeEmployee(long eid);
	
	public Employee searchEmployee(long eid);
	
	public Employee updateEmployee(long eid, String name, double sal, long did, String dname);
}
