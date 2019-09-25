package com.cg.labbookspringcore.ass1_2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("sbu")
public class SBU {
	@Value("1001")
	private int sbuId;
	@Value("Kiran Rao")
	private String sbuName;
	@Value("Product Engineering Services")
	private String sbuHead;
	public SBU() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SBU(int sbuId, String sbuName, String sbuHead) {
		super();
		this.sbuId = sbuId;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
	}
	@Override
	public String toString() {
		return "SBU [sbuId=" + sbuId + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + "]";
	}
	public int getSbuId() {
		return sbuId;
	}
	public void setSbuId(int sbuId) {
		this.sbuId = sbuId;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	
	
	
}
