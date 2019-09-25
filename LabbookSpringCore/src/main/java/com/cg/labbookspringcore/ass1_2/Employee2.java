package com.cg.labbookspringcore.ass1_2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("emp2")
public class Employee2 {

	@Value("12345")
	private int employeeId;
	@Value("Harriet")
	private String employeeName;
	@Value("40000.0")
	private double salary;
	private SBU businessUnit;
	@Value("30")
	private int age;

	public SBU getSbuDetails() {
		return businessUnit;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public SBU getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(SBU businessUnit) {
		this.businessUnit = businessUnit;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", businessUnit=" + businessUnit + ", age=" + age + "]";
	}

	public Employee2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee2(int employeeId, String employeeName, double salary, SBU businessUnit, int age) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.businessUnit = businessUnit;
		this.age = age;
	}
	
	
}
