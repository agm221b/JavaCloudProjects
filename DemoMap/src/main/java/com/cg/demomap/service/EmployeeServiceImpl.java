package com.cg.demomap.service;

import java.util.Map;

import com.cg.demomap.dao.EmployeeDaoEmpl;
import com.cg.demomap.dto.Department;
import com.cg.demomap.dto.Employee;
import com.cg.demomap.dto.Project;
import com.cg.demomap.excp.UserDefExcp;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeDaoEmpl dao = new EmployeeDaoEmpl();

	public Employee<Integer, Double, Department<Integer>> addEmployee(Integer eId,Employee<Integer, Double, Department<Integer>> emp) throws UserDefExcp {
		// TODO Auto-generated method stub
		//if(eId/1000>1)
			//throw new UserDefExcp("ID is invalid");
		return dao.addEmployee(eId,emp);
	}

	public Map<Integer, Employee<Integer, Double, Department<Integer>>> showEmployee() {
		// TODO Auto-generated method stub
		return dao.showEmployee();
	}

	public Employee<Integer, Double, Department<Integer>> searchEmployee(int s) {
		// TODO Auto-generated method stub
		return dao.searchEmployee(s);
	}

	public Employee<Integer, Double, Department<Integer>> remEmployee(int s) {
		// TODO Auto-generated method stub
		return dao.remEmployee(s);
	}
	
	public static void validateSalary(double salary) throws Exception {
		
		if(salary<10000)
			throw new UserDefExcp("Salary too less, must be greater than 10000");
		
	}

	public Project<Integer, Double> addProject(Integer pId, Project<Integer, Double> proj) {
		// TODO Auto-generated method stub
		return dao.addProject(pId, proj);
	}

	public Map<Integer, Project<Integer, Double>> showProject() {
		// TODO Auto-generated method stub
		return dao.showProject();
	}

	public Project<Integer, Double> removeProj(int s) {
		// TODO Auto-generated method stub
		return dao.removeProj(s);
	}

	public Project<Integer, Double> searchProj(int s) {
		// TODO Auto-generated method stub
		return dao.searchProj(s);
	}
	
	
	

}
