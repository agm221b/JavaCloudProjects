package Lab14.com.cg.eis.service;

import Lab14.com.cg.eis.bean.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee emp);
	public String findScheme(String designation, double sal);
	public Employee getEmployee(int id);
}
