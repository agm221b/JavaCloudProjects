package com.cg.employeemanagement.dto;

public class Employee<T,K> implements Comparable<Employee>{
	
	private Long empId;
	private String empName;
	private Double empSalary;
	private Department empDept;
	
	
	//
	public static final int limit=5;//limit 
	//
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Long empId, String empName, Double empSalary, Department empDept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDept = empDept;
	}
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}
	public Department getEmpDept() {
		return empDept;
	}
	public void setEmpDept(Department empDept) {
		this.empDept = empDept;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empDept=" + empDept
				+ "]";
	}
	
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
		
}
