package com.cg.democollection.ui;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.cg.democollection.dto.Employee;
import com.cg.democollection.service.EmployeeService;
import com.cg.democollection.service.EmployeeServiceImpl;
import com.cg.democollection.service.SortById;
import com.cg.democollection.service.SortByName;

public class MyApplication<T> {

	public static void main(String[] args) {

		/*Set<String> mySet = new HashSet<String>();

		mySet.add("Party");
		mySet.add("Abhi");
		mySet.add("Baaki");
		mySet.add("Hai");
		mySet.add("Abhi");
		mySet.add("Baaki");

		System.out.println(mySet.size());
		System.out.println("---------");
		for(int i=0;i<mySet.size();i++)
			System.out.println(mySet.toArray()[i]);
		System.out.println("---------");
		Iterator<String> it = mySet.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println("---------");

		Set<Employee<Integer, Double>> mySet = new HashSet<Employee<Integer,Double>>();

		Employee<Integer, Double> empOne = new Employee<Integer, Double>(1001,"Abc",1145.2);

		Employee<Integer, Double> empTwo = new Employee<Integer, Double>(1001,"Abc",1145.2);

		mySet.add(empOne);
		mySet.add(empTwo);

		for (Employee<Integer, Double> employee : mySet) {
			System.out.println("Emp ID is "+employee.getEmpId());
			System.out.println("Emp Name is "+employee.getEmpName());
			System.out.println("Emp Salary is "+employee.getEmpSalary());

		}

		Set<Integer> myset = new TreeSet<Integer>();

		myset.add(8);
		myset.add(3);
		myset.add(4);
		myset.add(1);
		myset.add(5);
		myset.add(3);

		List<Integer> myList = new ArrayList<Integer>();
		myList.add(1);
		//myList.add(5);
		//myList.add(4);
		myList.add(1);
		//myList.add(8);
		myList.add(2);
		myList.add(9);

		for (Integer i : myList) {
			System.out.println(myList.lastIndexOf(i));
			//System.out.println(myList.(i)+" =");
			System.out.println(myList.indexOf(i));
			System.out.println();
		}*/

		int choice;
		Scanner scr = new Scanner(System.in);
		EmployeeService serv = new EmployeeServiceImpl();
		do
		{
			printDetail();

			System.out.println("Enter the choice");
			choice = scr.nextInt();

			switch(choice)
			{
			case 1:
				System.out.println("Enter the id");
				Integer id =scr.nextInt();
				System.out.println("Enter the name");
				String name  = scr.next();
				System.out.println("Enter the Salary");
				Double sal = scr.nextDouble();

				Employee<Integer, Double> emp = new Employee<Integer, Double>();
				emp.setEmpId(id);
				emp.setEmpName(name);
				emp.setEmpSalary(sal);
				serv.addEmployee(emp);
				break;

			case 2: /*
				break;*/
				//show
				List<Employee<Integer, Double>> empL = serv.showEmployee();
				SortByName sort1 = new SortByName();
				
				SortById sort2 = new SortById();
				System.out.println("Enter 1 for sort by name, enter 2 for sort by ID");
				int k = scr.nextInt();
				if(k==1)
				Collections.sort(empL,sort1);
				else if(k==2)
				Collections.sort(empL, sort2);
				for(Employee<Integer, Double> employee : empL) {
					System.out.println("Emp id is "+ employee.getEmpId());
					System.out.println("Emp name is "+ employee.getEmpName());
					System.out.println("Emp salary is "+ employee.getEmpSalary());
				}
				default:
					break;

			}
	}while(choice!=2);



}

static void printDetail() {
	System.out.println("1 for add");
	System.out.println("2 for exit");
}


}
