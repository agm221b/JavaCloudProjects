package com.cg.employeemanagement.dao;

import com.cg.employeemanagement.dto.Department;
import com.cg.employeemanagement.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	Employee[] emp = new Employee[Employee.limit] ;
	int count=0;
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		this.emp[count++]= emp;
		return emp;
	}

	public Employee[] showEmployee() {
		// TODO Auto-generated method stub
		return this.emp;
	}

	public Employee searchEmployee(long eid) {
		// TODO Auto-generated method stub
		
		for(Employee e:emp)
		{
			if(e.getEmpId()==eid)
				return e;
		}
		System.out.println("Employee Not Found");
		return null;
	}
	
	public void removeEmployee(long eid) {
		// TODO Auto-generated method stub
		int flag=0;
		for(int i=0;i<Employee.limit;i++)
		{
			if(emp[i].getEmpId()==eid)
			{
				flag=1;
				System.out.println("Employee Removed");
				emp[i] = null;
			}
		}
		if(flag==0)
		System.out.println("Employee doesn't exist");
		
		//return null;
	}
	
	public Employee updateEmployee(long eid, String name, double sal, long did, String dname) {
		// TODO Auto-generated method stub
		//System.out.println(eid+"E.ID");
		int flag=0;
		for(Employee e:emp)
		{
			if(e.getEmpId()==eid)
			{
				//System.out.println(e);
				Department d= e.getEmpDept();
				d.setDeptId(did);
				d.setDeptName(dname);
				e.setEmpName(name);
				e.setEmpSalary(sal);
				flag=1;
				System.out.println("Updated successfully");
				
			}
			
			if(flag==0)
				System.out.println("Not found");
			return e;
		}
		
		return null;
		
		//return null;
	}
	

}
