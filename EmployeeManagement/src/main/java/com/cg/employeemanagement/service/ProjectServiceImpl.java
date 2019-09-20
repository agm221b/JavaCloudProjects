package com.cg.employeemanagement.service;

import com.cg.employeemanagement.dao.ProjectDao;
import com.cg.employeemanagement.dao.ProjectDaoImpl;
import com.cg.employeemanagement.dto.Employee;
import com.cg.employeemanagement.dto.Project;

public class ProjectServiceImpl implements ProjectService {
	
	ProjectDao projDao = new ProjectDaoImpl();

	public Project addProject(Project proj) {
		// TODO Auto-generated method stub
		return projDao.addProject(proj);
	}

	public Project[] showProject() {
		// TODO Auto-generated method stub
		return projDao.showProject();
	}

	public void removeProject(long eid) {
		// TODO Auto-generated method stub
		projDao.removeProject(eid);
	}

	public Project searchProject(long eid) {
		// TODO Auto-generated method stub
		return projDao.searchProject(eid);
	}

	public Project updateProject(long projId, String projName, double cost) {
		// TODO Auto-generated method stub
		return projDao.updateProject(projId, projName, cost);
	}

	public Employee addEmployeeToProject(long projId, Employee emp) {
		// TODO Auto-generated method stub
		return projDao.addEmployeeToProject(projId, emp);
	}

	public void removeEmployeeFromProject(long projId, Employee emp) {
		// TODO Auto-generated method stub
		projDao.removeEmployeeFromProject(projId, emp);
	}

}
