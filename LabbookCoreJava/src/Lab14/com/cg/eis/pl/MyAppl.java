package Lab14.com.cg.eis.pl;

import java.util.Scanner;

import Lab14.com.cg.eis.bean.Employee;
import Lab14.com.cg.eis.service.EmployeeService;
import Lab14.com.cg.eis.service.EmployeeServiceImpl;

public class MyAppl {

	static Scanner sc = new Scanner(System.in);
	static int ch;

	public static void main(String[] args) {

		EmployeeService es = new EmployeeServiceImpl();
		while (true) {
			System.out.println("1. Add Employee");
			System.out.println("2. Find Scheme");
			System.out.println("3. Get Employee");
			System.out.println("4. Exit");
			System.out.println("Enter your choice: ");
			ch = sc.nextInt();
			switch (ch) {
			case 1:

				System.out.println("Enter Name: ");
				String name = sc.next();
				System.out.println("Enter salary: ");
				double sal = sc.nextDouble();
				System.out.println("Enter id: ");
				int id = sc.nextInt();
				System.out.println("Enter Designation: ");
				String desg = sc.next();
				String scheme = es.findScheme(desg, sal);
				System.out.println(es.addEmployee(new Employee(id, name, desg, sal, scheme)));
				break;

			case 2:

				System.out.println("Enter Salary: ");
				double sal1 = sc.nextDouble();
				System.out.println("Enter designation: ");
				String desg1 = sc.next();
				System.out.println(es.findScheme(desg1, sal1));
				break;

			case 3:

				System.out.println("Enter employee id: ");
				int id1 = sc.nextInt();
				System.out.println(es.getEmployee(id1));
				break;

			case 4:
				sc.close();
				System.exit(1);
			}
		}
	}
}