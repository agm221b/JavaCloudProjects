package com.cg.labbookspringcore.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.labbookspringcore.ass1_1.Employee;
import com.cg.labbookspringcore.ass1_2.Employee2;
import com.cg.labbookspringcore.ass1_2.SBU;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Employee employee = (Employee) applicationContext.getBean("emp");
		System.out.println(employee);
		
		Employee2 employee2 =  applicationContext.getBean(Employee2.class, "emp2");
		SBU sbu = (SBU)applicationContext.getBean("sbu");
		employee2.setBusinessUnit(sbu);
		System.out.println(employee2);

	}

}
