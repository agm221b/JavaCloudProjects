package com.cg.jdbc.ems.client;

import java.math.BigDecimal;
import java.util.List;

import com.cg.jdbc.ems.dao.EmployeeDao;
import com.cg.jdbc.ems.dao.IEmployeeDao;
import com.cg.jdbc.ems.exception.EmployeeException;
import com.cg.jdbc.ems.model.Employee;

public class EmsClient {
	
	private static IEmployeeDao employeeDao;
	static {
		employeeDao = new EmployeeDao();
	}

	public static void main(String[] args) throws EmployeeException {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.setEmpName("Kara");
		employee.setEmpSal(BigDecimal.valueOf(9000.0));
		//adding emp obj by calling dao layer method
		employee = employeeDao.addEmployee(employee);
		if(employee!=null)
			System.out.println("Employee added successfully :"+employee);
		else
			System.out.println("Employee not added");
		//listing all emp obj by calling dao layer method
		List<Employee> empList = employeeDao.listAllEmployees();
		
		if(empList!=null)
		{
			empList.forEach(System.out::println);
		}
		else
			System.out.println("No record found");

	}

}
