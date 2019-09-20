package com.cg.employeemanagement.ui;

import java.util.Scanner;

import com.cg.employeemanagement.dto.Department;
import com.cg.employeemanagement.dto.Employee;
import com.cg.employeemanagement.dto.Project;
import com.cg.employeemanagement.service.EmployeeService;
import com.cg.employeemanagement.service.EmployeeServiceImpl;
import com.cg.employeemanagement.service.ProjectService;
import com.cg.employeemanagement.service.ProjectServiceImpl;

public class MyApplication {

	public static final int projEmplLimit=5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		EmployeeService service = new EmployeeServiceImpl();
		int t=0;
		ProjectService projServ = new ProjectServiceImpl();
		Employee empList[] = new Employee[5];
		try {

			System.out.println("Press 1 for Employee services, 2 for Project services");
			int ch= scr.nextInt();
			if(ch==1)
			{

				while(t<Employee.limit)
				{
					//Adding new Employee
					System.out.println("Enter the Employee"+(t+1)+" ID:");
					long id = scr.nextInt();

					System.out.println("Enter the Employee"+(t+1)+" Name");
					String name = scr.next();

					System.out.println("Enter the Employee"+(t+1)+" Salary");
					double sal = scr.nextDouble();

					System.out.println("Enter the Department"+(t+1)+" ID");
					long did = scr.nextInt();

					System.out.println("Enter the Department"+(t+1)+" name");
					String dname= scr.next();

					Department dep = new Department();
					dep.setDeptId(did);
					dep.setDeptName(dname);

					Employee emp = new Employee();
					emp.setEmpId(id);
					emp.setEmpName(name);
					emp.setEmpSalary(sal);
					emp.setEmpDept(dep);


					service.addEmployee(emp);
					t++;
				}

				Employee[] empArray = service.showEmployee();
				for (Employee i:empArray)
				{
					System.out.println(i.toString());

				}



				long eid;
				int flag=0;
				while(true) {
					System.out.println("Enter 1 for Searching, 2 for Removal, 3 for Updation");
					int val= scr.nextInt();
					switch(val) {
					case 1:
					{	//*****Search
						System.out.println("Enter the Employee ID to search");
						eid= scr.nextLong();
						System.out.println(service.searchEmployee(eid));
					}break;
					case 2:
					{	//*****Remove
						System.out.println("Enter the Employee ID to remove");
						eid= scr.nextLong();
						service.removeEmployee(eid);
					}break;
					case 3:
					{	//****Update
						System.out.println("Enter the Employee ID to update");
						eid= scr.nextLong();
						System.out.println("Enter the Employee Name");
						String name = scr.next();

						System.out.println("Enter the Employee Salary");
						double sal = scr.nextDouble();

						System.out.println("Enter the Department ID");
						long did = scr.nextInt();

						System.out.println("Enter the Department name");
						String dname= scr.next();

						System.out.println(service.updateEmployee(eid, name, sal, did, dname));
					}break;

					default: System.out.println("Wrong Choice");
					System.out.println("Thanks for using");
					flag=1;
					break;
					}
					if(flag==1)
						break;
				}



			}
			else
				if(ch==2)
				{
					//Adding new Project
					t=0;
					while(t<Project.limit)
					{
						System.out.println("Enter the Project"+(t+1)+" ID:");
						long id = scr.nextInt();

						System.out.println("Enter the Project"+(t+1)+" Name");
						String name = scr.next();

						System.out.println("Enter the Project"+(t+1)+" Cost");
						double cost = scr.nextDouble();
						
						Project proj = new Project();
						proj.setProjId(id);
						proj.setProjName(name);
						proj.setProjCost(cost);
						proj.setListOfEmp(empList);
						
						projServ.addProject(proj);
						
						//Adding an employee
						
						System.out.println("Enter the Employee ID:");
						long eid = scr.nextInt();

						System.out.println("Enter the Employee Name");
						String ename = scr.next();

						System.out.println("Enter the Employee Salary");
						double esal = scr.nextDouble();

						System.out.println("Enter the Department ID");
						long did = scr.nextInt();

						System.out.println("Enter the Department name");
						String dname= scr.next();

						Department dep = new Department();
						dep.setDeptId(did);
						dep.setDeptName(dname);

						Employee emp = new Employee();
						emp.setEmpId(eid);
						emp.setEmpName(ename);
						emp.setEmpSalary(esal);
						emp.setEmpDept(dep);
						
						
						projServ.addEmployeeToProject(id, emp);



					}

				}
		}catch(NullPointerException e)
		{
			System.out.println("Object not found");
		}
	}

}
