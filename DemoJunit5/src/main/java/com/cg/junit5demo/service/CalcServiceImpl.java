package com.cg.junit5demo.service;

public class CalcServiceImpl implements CalcService {

	public Double addNum(double d1, double d2) {
		// TODO Auto-generated method stub
		return d1+d2;
	}

	public Double subNum(double d1, double d2) {
		// TODO Auto-generated method stub
		return d1-d2;
	}

	public Double mulNum(double d1, double d2) {
		// TODO Auto-generated method stub
		return d1*d2;
	}

	public Double divNum(double d1, double d2) {
		// TODO Auto-generated method stub
		if(d2==0.0)
		{
			throw new ArithmeticException();
		}
		return d1/d2;
	}

}
