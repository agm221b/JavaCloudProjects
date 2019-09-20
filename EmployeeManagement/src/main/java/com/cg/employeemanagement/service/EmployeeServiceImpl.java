package com.cg.employeemanagement.service;

import com.cg.employeemanagement.dao.EmployeeDao;
import com.cg.employeemanagement.dao.EmployeeDaoImpl;
import com.cg.employeemanagement.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeDao dao = new EmployeeDaoImpl();

	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return dao.addEmployee(emp);
	}

	public Employee[] showEmployee() {
		// TODO Auto-generated method stub
		return dao.showEmployee();
	}

	public Employee searchEmployee(long eid) {
		// TODO Auto-generated method stub
		return dao.searchEmployee(eid);
	}

	public void removeEmployee(long eid) {
		// TODO Auto-generated method stub
		dao.removeEmployee(eid);;
	}

	public Employee updateEmployee(long eid, String name, double sal, long did, String dname) {
		// TODO Auto-generated method stub
		return dao.updateEmployee(eid, name, sal, did, dname);
	}
	
	
	
}
