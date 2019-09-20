package com.cg.demomap.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.demomap.dto.Department;
import com.cg.demomap.dto.Employee;
import com.cg.demomap.dto.Project;

public class EmployeeDaoEmpl implements EmployeeDao {

	Map<Integer, Employee<Integer, Double,Department<Integer>>> myList= new HashMap<Integer, Employee<Integer, Double,Department<Integer>>>();
	
	Map<Integer, Project<Integer, Double>> projList = new HashMap<Integer, Project<Integer,Double>>();
	public Employee<Integer, Double,Department<Integer>> addEmployee(Integer eId, Employee<Integer, Double,Department<Integer>> emp) {
		// TODO Auto-generated method stub
		//int c=0;
		myList.put(eId, emp);
		//c++;
		return emp;
	}

	public Map<Integer, Employee<Integer, Double,Department<Integer>>> showEmployee() {
		// TODO Auto-generated method stub
		
		return myList;
	}

	public Employee<Integer, Double,Department<Integer>> searchEmployee(int s) {
		// TODO Auto-generated method stub
		return myList.get(s);
	}

	public Employee<Integer, Double,Department<Integer>> remEmployee(int s) {
		// TODO Auto-generated method stub
		
				return myList.remove(s);
	}

	public Project<Integer, Double> addProject(Integer pId,Project<Integer, Double> proj) {
		// TODO Auto-generated method stub
		projList.put(pId, proj);
		return proj;
	}

	public Map<Integer, Project<Integer, Double>> showProject() {
		// TODO Auto-generated method stub
		return projList;
	}

	public Project<Integer, Double> removeProj(int s) {
		// TODO Auto-generated method stub
		return projList.remove(s);
	}

	public Project<Integer, Double> searchProj(int s) {
		// TODO Auto-generated method stub
		return projList.get(s);
	}
	

}
