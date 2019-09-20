package com.cg.employeemanagement.dao;

import com.cg.employeemanagement.dto.Employee;
//import com.cg.employeemanagement.dto.Employee;
import com.cg.employeemanagement.dto.Project;

public interface ProjectDao {
	
	public Project addProject(Project proj);
	
	public Project[] showProject();
	
	public Project searchProject(long eid);
	
	public void removeProject(long eid);
	
	public Project updateProject(long projId, String projName, double cost); 
	
	public Employee addEmployeeToProject(long projId, Employee emp);
	
	public void removeEmployeeFromProject(long projId, Employee emp);
}
