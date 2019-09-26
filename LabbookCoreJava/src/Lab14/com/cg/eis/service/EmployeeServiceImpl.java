package Lab14.com.cg.eis.service;

import java.util.ArrayList;
import java.util.List;

import Lab14.com.cg.eis.bean.Employee;
import Lab14.com.cg.eis.bean.EmployeeScheme;

public class EmployeeServiceImpl implements EmployeeService {

	List<Employee> empList = new ArrayList<Employee>();
	@Override
	public Employee addEmployee(Employee emp) {
		empList.add(emp);
		return emp;
	}

	@Override
	public String findScheme(String designation, double sal) {
		EmployeeScheme es = new EmployeeScheme();
		return es.find(designation, sal);
	}

	public Employee getEmployee(int id) {
		for (Employee emp : empList) {
			if (emp.getId() == id) {
				return emp;
			}
		}
		return null;
	}

	

}
