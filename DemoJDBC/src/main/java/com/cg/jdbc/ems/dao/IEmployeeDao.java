package com.cg.jdbc.ems.dao;

import java.util.List;

import com.cg.jdbc.ems.exception.EmployeeException;
import com.cg.jdbc.ems.model.Employee;

public interface IEmployeeDao {
	public Employee addEmployee(Employee employee)throws EmployeeException;
	public List<Employee> listAllEmployees()throws EmployeeException;

}
