package com.cg.demojunit.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cg.demojunit.service.CalculatorService;
import com.cg.demojunit.service.CalculatorServiceImpl;

public class CalculatorTest {

	CalculatorService service;
	@Before
	public void beforeTest() {
		service = new CalculatorServiceImpl();
		
	}
	
	@Test
	public void myTest() {
		assertEquals(new Double(30.0), service.addNumber(10.0, 20.0));
		assertEquals(new Double(20.0), service.subNumber(40.0, 20.0));
		assertEquals(new Double(8.0), service.mulNumber(4.0, 2.0));
		assertEquals(new Double(2.0), service.divNumber(40.0, 20.0));
	}
	
	@Test(expected = ArithmeticException.class)
	public void myTestException() {
		assertEquals(new Double(2.0), service.divNumber(40.0, 0.0));
	}
	
	@After
	public void afterTest() {
		service=null;
	}

}
