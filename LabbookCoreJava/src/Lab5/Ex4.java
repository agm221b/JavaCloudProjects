package Lab5;

import java.util.Scanner;

public class Ex4 {

	public void run() throws UserDefExcp, EmployeeException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name: ");
		String fName = sc.next();
		System.out.println("Enter the middle name: ");
		String mName = sc.next();
		System.out.println("Enter the last name: ");
		String lName = sc.next();
		
		if(fName.length()==0 || lName.length()==0)
			throw new UserDefExcp("First/Last Name are null");
		
		System.out.println("Enter the age: ");
		int age= sc.nextInt();
		
		if(age<15)
			throw new UserDefExcp("Age should be above 15");
		
		System.out.println("Enter the salary: ");
		double sal= sc.nextDouble();
		
		if(sal<3000)
			throw new EmployeeException("Salary should be above 3000");
	}
}
