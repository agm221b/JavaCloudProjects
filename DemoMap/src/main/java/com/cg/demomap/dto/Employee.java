package com.cg.demomap.dto;



public class Employee<T,K, D>{

	/*public int compareTo(Employee<Integer, Double> o) {
			// TODO Auto-generated method stub
			if((Double)this.empSalary > (Double)o.empSalary) {
				return 1;
			}else if((Double)this.empSalary< (Double)o.empSalary)
			{
				return -1;
			}
			return 0;
		}
	 */
	T empId;
	String empName;
	K empSalary;
	D dept;
	Integer eProjId;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(T empId, String empName, K empSalary, D dept, Integer eProjId) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.dept = dept;
		this.eProjId = eProjId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empId == null) ? 0 : empId.hashCode());
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + ((empSalary == null) ? 0 : empSalary.hashCode());
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		result = prime * result + ((eProjId == null) ? 0 : eProjId.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", dept=" + dept
				+  "eProjId=" + eProjId + "]";
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
		if (empSalary == null) {
			if (other.empSalary != null)
				return false;
		} else if (!empSalary.equals(other.empSalary))
			return false;
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
		if (eProjId == null) {
			if (other.eProjId != null)
				return false;
		} else if (!eProjId.equals(other.eProjId))
			return false;
		return true;
	}

	public T getEmpId() {
		return empId;
	}

	public void setEmpId(T empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public K getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(K empSalary) {
		this.empSalary = empSalary;
	}

	public D getDept() {
		return dept;
	}

	public void setDept(D dept) {
		this.dept = dept;
	}

	public Integer geteProjId() {
		return eProjId;
	}

	public void seteProjId(Integer eProjId) {
		this.eProjId = eProjId;
	}




}
