package com.cg.demomap.service;

import java.util.Map;

import com.cg.demomap.dto.Department;
import com.cg.demomap.dto.Employee;
import com.cg.demomap.dto.Project;
import com.cg.demomap.excp.UserDefExcp;

public interface EmployeeService {
	

	public Employee<Integer, Double,Department<Integer>> addEmployee(Integer eId,Employee<Integer, Double, Department<Integer>> emp) throws UserDefExcp;
	public Map<Integer, Employee<Integer, Double,Department<Integer>>> showEmployee();
	public Employee<Integer, Double,Department<Integer>> searchEmployee(int s);
	public Employee<Integer, Double,Department<Integer>> remEmployee(int s);
	
	public Project<Integer, Double> addProject(Integer pId, Project<Integer, Double> proj);
	public Map<Integer,Project<Integer, Double>> showProject();
	public Project<Integer, Double> removeProj(int s);
	public Project<Integer, Double> searchProj(int s);
	
	//Exception to be handled here
}
