package com.cg.employeemanagement.dao;

//import com.cg.employeemanagement.dto.Department;
import com.cg.employeemanagement.dto.Employee;
import com.cg.employeemanagement.dto.Project;

public class ProjectDaoImpl implements ProjectDao {
	
	Project[] proj = new Project[Project.limit];
	
	int count=0;

	public Project addProject(Project proj) {
		// TODO Auto-generated method stub
		this.proj[count++]=proj;
		return proj;
	}

	public Project[] showProject() {
		// TODO Auto-generated method stub
		return this.proj;
	}

	public Project searchProject(long eid) {
		// TODO Auto-generated method stub
		for(Project p:proj)
		{
			if(p.getProjId()==eid)
				return p;
		}
		System.out.println("Project Not found");
		return null;
	}

	public void removeProject(long eid) {
		// TODO Auto-generated method stub
		int flag=0;
		for(int i=0;i<Project.limit;i++)
		{
			if(proj[i].getProjId()==eid)
			{
				flag=1;
				System.out.println("Project Removed");
				proj[i] = null;
			}
		}
		if(flag==0)
		System.out.println("Project doesn't exist");

	}

	public Project updateProject(long projId, String projName, double projCost) {
		// TODO Auto-generated method stub
		int flag=0;
		for(Project p:proj)
		{
			if(p.getProjId()==projId)
			{
				//System.out.println(e);
				p.setProjName(projName);
				p.setProjCost(projCost);
				flag=1;
				System.out.println("Updated successfully");
				
			}
			
			if(flag==0)
				System.out.println("Not found");
			return p;
		}
		return null;
	}

	public Employee addEmployeeToProject(long projId, Employee emp) {
		// TODO Auto-generated method stub
		for(Project p:proj)
		{
			if(p.getProjId()==projId)
			{
				Employee[] empList =p.getListOfEmp();
				int i=0,flag=0;
				for(i=0;i<empList.length;i++)
				{
					if(empList[i]==null)
					{
						empList[i]=emp;
						p.setListOfEmp(empList);
						flag=1;
					}
					
				}
				if(flag==0)
				{
					System.out.println("Project capacity full");
					
				}
				return emp;
			}
		}
		System.out.println("Project Not found");
		return null;
	}

	public void removeEmployeeFromProject(long projId, Employee emp) {
		// TODO Auto-generated method stub
		for(Project p:proj)
		{
			if(p.getProjId()==projId)
			{
				Employee[] empList =p.getListOfEmp();
				int i=0;
				long eid =emp.getEmpId();
				for(i=0;i<empList.length;i++)
				{
					if(empList[i].getEmpId()==eid)
					{
						empList[i]=null;
						p.setListOfEmp(empList);
					}
					else
						System.out.println("Employee Not Found");
				}
				//return emp;
			}
		}
		System.out.println("Project Not found");
		//return null;
	}

}
