import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cg.employeemanagement.dto.Department;
import com.cg.employeemanagement.dto.Employee;
import com.cg.employeemanagement.service.EmployeeService;
import com.cg.employeemanagement.service.EmployeeServiceImpl;

class EmpServiceTest {
	
	EmployeeService es;
	
	@BeforeEach
	public void beforeTest() {
		es = new EmployeeServiceImpl();
	}
	

	@Test
	public void runAddTest() {
		Employee emp=new Employee();
		emp.setEmpId( 4L);
		emp.setEmpName("Devang");
		emp.setEmpSalary(4567.9);
		Department d = new Department();
		d.setDeptId(566L);
		d.setDeptName("Dep1");
		emp.setEmpDept(d);
		
		assertEquals(emp, es.addEmployee(emp));
	}
	
	@Test
	public void showTest() {
		Employee emp=new Employee();
		emp.setEmpId( 4L);
		emp.setEmpName("Devang");
		emp.setEmpSalary(4567.9);
		Department d = new Department();
		d.setDeptId(566L);
		d.setDeptName("Dep1");
		emp.setEmpDept(d);
		es.addEmployee(emp);
		
		Employee emp2=new Employee();
		emp2.setEmpId( 34L);
		emp2.setEmpName("Dang");
		emp2.setEmpSalary(45617.9);
		Department d2 = new Department();
		d2.setDeptId(3366L);
		d2.setDeptName("Dep2");
		emp.setEmpDept(d2);
		es.addEmployee(emp2);
		
		Employee empL[]= es.showEmployee();
		assertEquals(emp, empL[0]);
		assertEquals(emp2, empL[1]);
		assertEquals(null, empL[2]);
		assertEquals(null, empL[3]);
		assertEquals(null, empL[4]);
		
	}
	
	@AfterEach
	public void afterTest() {
		es = null;
	}

}
