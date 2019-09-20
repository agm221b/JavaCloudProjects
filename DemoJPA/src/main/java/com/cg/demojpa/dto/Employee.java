package com.cg.demojpa.dto;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "jpa_employee")	//if attribute name not mentioned, itll create employee table
public class Employee {
	
	
	@Id						//primary key
	@Column(name = "emp_id")
	private Integer empId;
	@Column(name = "emp_name")
	private String empName;
	@Column(name = "emp_sal")
	private Double empSal;
	
	private Date dateOfJoining;
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	
	@Embedded
	private Address address;
	
	@OneToOne(cascade = CascadeType.ALL)				//going from one side currently, unidirectional
	private Project proj;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer empId, String empName, Double empSal, Date dateOfJoining, Address address, Project project) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.dateOfJoining = dateOfJoining;
		this.address = address;
		this.proj = project;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Project getProj() {
		return proj;
	}
	public void setProj(Project proj) {
		this.proj = proj;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (dateOfJoining == null) {
			if (other.dateOfJoining != null)
				return false;
		} else if (!dateOfJoining.equals(other.dateOfJoining))
			return false;
		if (empId == null) {
			if (other.empId != null)
				return false;
		} else if (!empId.equals(other.empId))
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (empSal == null) {
			if (other.empSal != null)
				return false;
		} else if (!empSal.equals(other.empSal))
			return false;
		if (proj == null) {
			if (other.proj != null)
				return false;
		} else if (!proj.equals(other.proj))
			return false;
		return true;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((dateOfJoining == null) ? 0 : dateOfJoining.hashCode());
		result = prime * result + ((empId == null) ? 0 : empId.hashCode());
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + ((empSal == null) ? 0 : empSal.hashCode());
		result = prime * result + ((proj == null) ? 0 : proj.hashCode());
		return result;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", dateOfJoining="
				+ dateOfJoining + ", address=" + address + ", proj=" + proj + "]";
	}
	
}
