package com.cg.demomap.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.cg.demomap.dto.Department;
import com.cg.demomap.dto.Employee;
import com.cg.demomap.dto.Project;
import com.cg.demomap.excp.UserDefExcp;
import com.cg.demomap.service.EmployeeService;
import com.cg.demomap.service.EmployeeServiceImpl;

public class MyApplication {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		int choice;
		Scanner scr = new Scanner(System.in);
		EmployeeService serv = new EmployeeServiceImpl();
		Map<Integer, Employee<Integer, Double,Department<Integer>>> hm = new Hashtable<Integer, Employee<Integer, Double,Department<Integer>>>();
		do
		{
			printDetail();

			System.out.println("Enter the choice");
			choice = scr.nextInt();

			switch(choice)
			{
			case 1:
				/*System.out.println("Enter the id");
				Integer id =scr.nextInt();
				System.out.println("Enter the name");
				String name  = scr.next();
				System.out.println("Enter the Salary");
				Double sal = scr.nextDouble();*/

				Employee<Integer, Double,Department<Integer>> emp = new Employee<Integer, Double,Department<Integer>>();
				emp.setEmpId(23);
				emp.setEmpName("Devang");
				emp.setEmpSalary(88888.6);
				Department<Integer> d = new Department<Integer>();
				d.setDeptId(244);
				d.setDeptName("D1");
				emp.setDept(d);
				emp.seteProjId(1);
				serv.addEmployee(emp.getEmpId(),emp);
				//hm.put(emp.getEmpId(), emp);
				

				Employee<Integer, Double,Department<Integer>> emp2 = new Employee<Integer, Double,Department<Integer>>();
				emp2.setEmpId(2);
				emp2.setEmpName("Singh");
				emp2.setEmpSalary(12252.2);
				try {
					EmployeeServiceImpl.validateSalary(emp2.getEmpSalary());
				} catch (UserDefExcp e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				Department<Integer> d2 = new Department<Integer>();
				d2.setDeptId(244);
				d2.setDeptName("D1");
				emp2.setDept(d2);
				emp2.seteProjId(2);
				serv.addEmployee(emp2.getEmpId(),emp2);
				//hm.put(emp2.getEmpId(), emp2);

				Employee<Integer, Double,Department<Integer>> emp3 = new Employee<Integer, Double,Department<Integer>>();
				emp3.setEmpId(1523);
				emp3.setEmpName("Gautam");
				emp3.setEmpSalary(54546.7);
				Department<Integer> d3 = new Department<Integer>();
				d3.setDeptId(244);
				d3.setDeptName("D1");
				emp3.setDept(d3);
				emp3.seteProjId(3);
				serv.addEmployee(emp3.getEmpId(),emp3);
				//hm.put(emp3.getEmpId(), emp3);
				break;

			case 2: /*
				break;*/
				//show
				//Map<Integer, Employee<Integer, Double>> empL = new HashMap<Integer, Employee<Integer,Double>>();
				//SortByName sort1 = new SortByName();

				//SortById sort2 = new SortById();
				//System.out.println("Enter 1 for sort by name, enter 2 for sort by ID");
				//int k = scr.nextInt();
				//if(k==1)
				//Collections.sort(empL,sort1);
				//else if(k==2)
				//Collections.sort(empL, sort2);
				
				Set< Map.Entry< Integer, Employee<Integer, Double,Department<Integer>>> > st = serv.showEmployee().entrySet();//hm.entrySet();   
				List<Employee<Integer,Double,Department<Integer>>> li = new ArrayList<Employee<Integer, Double,Department<Integer>>>();
				
				for (Map.Entry< Integer, Employee<Integer, Double,Department<Integer>>> me:st) 
				{ 
					System.out.print(me.getKey()+":"); 
					System.out.println(me.getValue().getEmpName()+" "+me.getValue().getEmpSalary()); 
					li.add(me.getValue());
				} 
				
				System.out.println("-------------Sort by Salary----------");
				
				Collections.sort(li,new MyApplication.SortBySal());
				for(Employee<Integer, Double,Department<Integer>> employee : li) {
					System.out.println(employee);
					System.out.println();
				}
				
				System.out.println("-------------Sort by ID----------");
				
				Collections.sort(li,new MyApplication.SortByID());
				for(Employee<Integer, Double,Department<Integer>> employee : li) {
					System.out.println(employee);
					System.out.println();
				}
				
				System.out.println("-------------Sort by Name----------");
				
				Collections.sort(li,new MyApplication.SortByName());
				for(Employee<Integer, Double, Department<Integer>> employee : li) {
					System.out.println(employee);
					//System.out.println("Emp id is "+ employee.getEmpId());
					//System.out.println("Emp name "+ employee.getEmpName());
					//System.out.println("Emp sal "+ employee.getEmpSalary());
					System.out.println();
				}
				break;
			case 3:
				System.out.println("Enter the ID to be searched");
				int s = scr.nextInt();
				Employee<Integer, Double, Department<Integer>> e4 =serv.searchEmployee(s);//hm.get(s);
				//System.out.println("Emp id is "+ e4.getEmpId());
				//System.out.println("Emp name "+ e4.getEmpName());
				//System.out.println("Emp sal "+ e4.getEmpSalary());
				System.out.println(e4);
				System.out.println();
				break;
			
			case 4:
				System.out.println("Enter the ID to be removed");
				int s2 = scr.nextInt();
				Employee<Integer, Double, Department<Integer>> e5 =serv.remEmployee(s2);
				//Employee<Integer, Double> e5 =hm.remove(s2);
				
				System.out.println("Removed employee:");
				//System.out.println("Emp id is "+ e5.getEmpId());
				//System.out.println("Emp name "+ e5.getEmpName());
				//System.out.println("Emp sal "+ e5.getEmpSalary());
				System.out.println(e5);
				System.out.println();
				break;
			case 5:
				//System.out.println("Enter the project ID");
				//int pId = scr.nextInt();
				Employee<Integer, Double,Department<Integer>> emp1 = new Employee<Integer, Double,Department<Integer>>();
				emp1.setEmpId(23);
				emp1.setEmpName("Devang");
				emp1.setEmpSalary(888.6);
				Department<Integer> d1 = new Department<Integer>();
				d1.setDeptId(244);
				d1.setDeptName("D1");
				emp1.setDept(d1);
				emp1.seteProjId(11);
				Map<Integer,Employee<Integer, Double, Department<Integer>>> pEmpList =  new HashMap<Integer,Employee<Integer,Double,Department<Integer>>>();
				pEmpList.put(emp1.getEmpId(),emp1);
				Project<Integer, Double> proj = new Project<Integer, Double>();
				proj.setListOfEmp(pEmpList);
				proj.setProjId(11);
				proj.setProjCost(23456.7);
				proj.setProjName("Project1");
				serv.addProject(proj.getProjId(),proj);
				break;
				
			case 6:
				//Show Project
				//Set<Map.Entry<Integer, Project<Integer, Double>>> projList = serv.showProject().entrySet();
				//List<Project<Integer,Double>> li1 = new ArrayList<Project<Integer, Double>>();
				System.out.println(serv.showProject());
				//for (Map.Entry< Integer, Project<Integer, Double>> me:projList) 
				//{ 
				//	System.out.print(me.getKey()+":"); 
				//	System.out.println(me.getValue().getProjName()+" "+me.getValue().getProjCost()); 
				//	li1.add(me.getValue());
				//s} 
				break;
			
			case 7:
				//Remove project
				System.out.println("Enter the proj to be searched");
				int s1 = scr.nextInt();
				Project<Integer, Double> searchProj = serv.searchProj(s1);
				System.out.println(searchProj.toString());
				break;
				
			case 8:
				//Remove project
				System.out.println("Enter the proj to be removed");
				int s21 = scr.nextInt();
				Project<Integer, Double> remProj = serv.removeProj(s21);
				System.out.println(remProj.toString());
				break;
			default: 
				//UserDefExcp e = new UserDefExcp("Invalid Choice Entered");
				//throw e;
				//break;
			}
		}while(choice>0 && choice <9);



	}

	static void printDetail() {
		System.out.println("1 for adding emp");
		System.out.println("2 for displaying emp");
		System.out.println("3 for searching emp");
		System.out.println("4 for removing emp");
		System.out.println("5 for adding proj");
		System.out.println("6 for displaying proj");
		System.out.println("7 for searching proj");
		System.out.println("8 for removing proj");
	}
	private static class SortBySal implements Comparator<Employee<Integer, Double, Department<Integer>>>{

		public int compare(Employee<Integer, Double, Department<Integer>> o1, Employee<Integer, Double, Department<Integer>> o2) {
			// TODO Auto-generated method stub
			if(o1.getEmpSalary()>o2.getEmpSalary())
				return 1;
			else if(o1.getEmpSalary()==o2.getEmpSalary())
				return 0;
			else
				return -1;
		}
	}
	private static class SortByID implements Comparator<Employee<Integer, Double, Department<Integer>>>{

			public int compare(Employee<Integer, Double, Department<Integer>> o1, Employee<Integer, Double, Department<Integer>> o2) {
				// TODO Auto-generated method stub
				if(o1.getEmpId()>o2.getEmpId())
					return 1;
				else if(o1.getEmpId()==o2.getEmpId())
					return 0;
				else
					return -1;
			}
		
	}
		
	private static class SortByName implements Comparator<Employee<Integer, Double, Department<Integer>>>{

			public int compare(Employee<Integer, Double, Department<Integer>> o1, Employee<Integer, Double, Department<Integer>> o2) {
				// TODO Auto-generated method stub
				
					return o1.getEmpName().compareTo(o2.getEmpName());
			}
		
	}


}

