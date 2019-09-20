package com.cg.employeemanagement.service;

import com.cg.employeemanagement.dto.Employee;
//import com.cg.employeemanagement.dto.Employee;
import com.cg.employeemanagement.dto.Project;

public interface ProjectService {

	public Project addProject(Project proj);
	
	public Project[] showProject();
	
	public void removeProject(long eid);
	
	public Project searchProject(long eid);
	
	public Project updateProject(long projId, String projName, double cost); 
	
	public Employee addEmployeeToProject(long projId, Employee emp);
	
	public void removeEmployeeFromProject(long projId, Employee emp);
}
