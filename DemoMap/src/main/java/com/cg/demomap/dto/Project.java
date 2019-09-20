package com.cg.demomap.dto;

import java.util.Map;

public class Project<T,V> {
	
	T projId;
	String projName;
	Map<Integer,Employee<Integer,Double, Department<Integer>>> listOfEmp;
	V projCost;
	public T getProjId() {
		return projId;
	}
	public void setProjId(T projId) {
		this.projId = projId;
	}
	public String getProjName() {
		return projName;
	}
	public void setProjName(String projName) {
		this.projName = projName;
	}
	public Map<Integer, Employee<Integer, Double, Department<Integer>>> getListOfEmp() {
		return listOfEmp;
	}
	public void setListOfEmp(Map<Integer, Employee<Integer, Double, Department<Integer>>> listOfEmp) {
		this.listOfEmp = listOfEmp;
	}
	public V getProjCost() {
		return projCost;
	}
	public void setProjCost(V projCost) {
		this.projCost = projCost;
	}
	@Override
	public String toString() {
		return "Project [projId=" + projId + ", projName=" + projName + ", listOfEmp=" + listOfEmp + ", projCost="
				+ projCost + "]";
	}
	
	

}
