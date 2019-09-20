package com.cg.democollection.service;

import java.util.List;

import com.cg.democollection.dao.EmployeeDao;
import com.cg.democollection.dao.EmployeeDaoImpl;
import com.cg.democollection.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDao empdao = new EmployeeDaoImpl();
	//@Override
	public Employee<Integer, Double> addEmployee(Employee<Integer, Double> emp) {
		// TODO Auto-generated method stub
		return empdao.addEmployee(emp);
	}

	public List<Employee<Integer, Double>> showEmployee() {
		// TODO Auto-generated method stub
		return empdao.showEmployee();
	}

}
