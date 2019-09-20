package com.cg.demojpa.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.cg.demojpa.dto.Address;
import com.cg.demojpa.dto.Department;
import com.cg.demojpa.dto.Employee;
import com.cg.demojpa.dto.Project;
import com.cg.demojpa.service.EmployeeService;
import com.cg.demojpa.service.EmployeeServiceImpl;

public class EmployeeMain {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		EmployeeService employeeService = new EmployeeServiceImpl();

		Scanner sc = new Scanner(System.in);
		int id;
		double sal, min, max, projCost;
		String name;
		int choice;
		SimpleDateFormat st = new SimpleDateFormat("yyyy/MM/dd");
		String date, city, state, projName, deptName;
		Date dateNew;
		int pincode, projId, deptId;
		Department d = new Department();
		d.setDeptId(2334);
		d.setDeptName("D1");
		Address addr = new Address("C1", "S1", 394994);
		Project proj = new Project(3443, "P1", 30340.3);
		Date date2 = st.parse("2019/09/01");
		Employee e1 = new Employee(4, "a1", 3003.3, date2, addr, proj, d);
		Project proj2 = new Project(43, "P2", 340.3);
		Employee e2 = new Employee(2, "a12", 303.3, date2, addr, proj2, d);
		Project proj3 = new Project(34, "P3", 300.1);
		Employee e3 = new Employee(3, "a123", 13003.3, date2, addr, proj3, d);
		//employeeService.addEmployee(e1);
		employeeService.addEmployee(e2);
		employeeService.addEmployee(e3);

		/*
		 * while (true) { System.out.
		 * println("1- Add, 2-Delete, 3- Update, 4-ViewAll, 5-Find between Salaries, 6-Exit"
		 * ); choice = sc.nextInt(); if (choice == 1) {
		 * System.out.println("Enter the Id"); id = sc.nextInt();
		 * System.out.println("Enter Name"); name = sc.next();
		 * System.out.println("Enter the salary"); sal = sc.nextDouble();
		 * System.out.println("Enter the date of joining"); date = sc.next(); dateNew =
		 * st.parse(date); Employee emp = new Employee(); emp.setEmpId(id);
		 * emp.setEmpName(name); emp.setEmpSal(sal); emp.setDateOfJoining(dateNew);
		 * 
		 * System.out.println("Enter the city"); city = sc.next();
		 * System.out.println("Enter the state"); state = sc.next();
		 * System.out.println("Enter the pincode"); pincode = sc.nextInt(); Address addr
		 * = new Address(); addr.setCity(city); addr.setState(state);
		 * addr.setPincode(pincode); emp.setAddress(addr);
		 * 
		 * 
		 * Project proj = new Project(); System.out.println("Enter the Project ID");
		 * projId = sc.nextInt(); System.out.println("Enter the Project Name"); projName
		 * = sc.next(); System.out.println("Enter the Project Cost"); projCost =
		 * sc.nextDouble(); proj.setProjId(projId); proj.setProjName(projName);
		 * proj.setProjCost(projCost); emp.setProj(proj);
		 * 
		 * Department dept = new Department(); System.out.println("Enter the dept Id");
		 * deptId = sc.nextInt(); System.out.println("Enter the dept Name"); deptName =
		 * sc.next(); dept.setDeptId(deptId); dept.setDeptName(deptName);
		 * emp.setDept(dept);
		 * 
		 * //dept.setEmpList(empList);
		 * 
		 * employeeService.addEmployee(emp);
		 * 
		 * 
		 * // Department d = new Department(); d.setDeptId(2334); d.setDeptName("D1");
		 * Address addr= new Address("C1", "S1",394994); Project proj = new
		 * Project(3443,"P1",30340.3); Date date2 = st.parse("2019/09/01"); Employee e1
		 * = new Employee(4,"a1",3003.3, date2,addr, proj, d); Project proj2 = new
		 * Project(43,"P2",340.3); Employee e2 = new Employee(2,"a12",303.3, date2,addr,
		 * proj2, d); Project proj3 = new Project(34,"P3",300.1); Employee e3 = new
		 * Employee(3,"a123",13003.3, date2,addr, proj3, d);
		 * employeeService.addEmployee(e1); employeeService.addEmployee(e2);
		 * employeeService.addEmployee(e3);
		 * 
		 * // } if (choice == 2) { System.out.println("Enter the Id to remove: "); id =
		 * sc.nextInt(); try { employeeService.removeEmployee(id); break; } catch
		 * (Exception e) { // TODO: handle exception System.out.println("\nException: "
		 * + e.getMessage()); continue; } } if(choice==3) {
		 * System.out.println("Enter the Id to update: "); id=sc.nextInt();
		 * 
		 * System.out.println("Enter Name"); name = sc.next();
		 * 
		 * System.out.println("Enter the salary"); sal = sc.nextDouble();
		 * 
		 * employeeService.removeEmployee(id); Employee emp = new Employee();
		 * emp.setEmpId(id); emp.setEmpName(name);
		 * 
		 * 
		 * employeeService.updateEmpSal(id, sal);
		 * 
		 * //employeeService.addEmployee(emp); } if(choice==4) { List<Employee> empList
		 * = employeeService.showAll(); System.out.println(empList); } if(choice==5) {
		 * System.out.println("Enter the salary range, from:"); min = sc.nextDouble();
		 * max = sc.nextDouble(); System.out.println(employeeService.findBetwSal(min,
		 * max)); } if(choice==6) { System.exit(1); } }
		 */
		sc.close();
	}

}
