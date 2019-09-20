package com.cg.employeemanagement.dto;

public class Project {
	
	private Long projId;
	private String projName;
	private Employee[] listOfEmp;
	private Double projCost;
	
	public static final int limit=1;//limit 
	
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Project(Long projId, String projName, Employee[] listOfEmp, Double projCost) {
		super();
		this.projId = projId;
		this.projName = projName;
		this.listOfEmp = listOfEmp;
		this.projCost = projCost;
	}
	
	public Long getProjId() {
		return projId;
	}
	public void setProjId(Long projId) {
		this.projId = projId;
	}
	public String getProjName() {
		return projName;
	}
	public void setProjName(String projName) {
		this.projName = projName;
	}
	public Employee[] getListOfEmp() {
		return listOfEmp;
	}
	public void setListOfEmp(Employee[] listOfEmp) {
		this.listOfEmp = listOfEmp;
	}
	public Double getProjCost() {
		return projCost;
	}
	public void setProjCost(Double projCost) {
		this.projCost = projCost;
	}
	
	
}
