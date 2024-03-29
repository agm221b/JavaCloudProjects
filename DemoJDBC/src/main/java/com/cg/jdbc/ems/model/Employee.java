package com.cg.jdbc.ems.model;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Employee {

	private BigInteger empId;
	private String empName;
	private BigDecimal empSal;
	public BigInteger getEmpId() {
		return empId;
	}
	public void setEmpId(BigInteger empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public BigDecimal getEmpSal() {
		return empSal;
	}
	public void setEmpSal(BigDecimal empSal) {
		this.empSal = empSal;
	}
	@Override
	public int hashCode() {
		
		return this.empId.intValue();
	}
	@Override
	public boolean equals(Object obj) {
		return this.hashCode()==obj.hashCode();
	}
	public Employee(BigInteger empId, String empName, BigDecimal empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
	
	
}
