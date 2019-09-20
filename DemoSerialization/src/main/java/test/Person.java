package test;

import java.io.Serializable;

public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 617797518862315365L;
	String name;
	String PAN;
	String aadhar;
	@Override
	public String toString() {
		return "Person [name=" + name + ", PAN=" + PAN + ", aadhar=" + aadhar + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPAN() {
		return PAN;
	}
	public void setPAN(String pAN) {
		PAN = pAN;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public Person(String name, String pAN, String aadhar) {
		super();
		this.name = name;
		PAN = pAN;
		this.aadhar = aadhar;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
