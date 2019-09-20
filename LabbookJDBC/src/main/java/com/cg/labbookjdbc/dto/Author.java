package com.cg.labbookjdbc.dto;

import java.math.BigInteger;

public class Author {

	private BigInteger authorId;
	private String firstName;
	private String middleName;
	private String lastName;
	private BigInteger phoneNo;
	public BigInteger getAuthorId() {
		return authorId;
	}
	public void setAuthorId(BigInteger authorId) {
		this.authorId = authorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public BigInteger getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(BigInteger phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Author(String firstName, String middleName, String lastName, BigInteger phoneNo) {
		super();
		//this.authorId = authorId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "Author \n[authorId=" + authorId + ",\n firstName=" + firstName + ",\n middleName=" + middleName
				+ ",\n lastName=" + lastName + ",\n phoneNo=" + phoneNo + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authorId == null) ? 0 : authorId.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
		result = prime * result + ((phoneNo == null) ? 0 : phoneNo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		if (authorId == null) {
			if (other.authorId != null)
				return false;
		} else if (!authorId.equals(other.authorId))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (middleName == null) {
			if (other.middleName != null)
				return false;
		} else if (!middleName.equals(other.middleName))
			return false;
		if (phoneNo == null) {
			if (other.phoneNo != null)
				return false;
		} else if (!phoneNo.equals(other.phoneNo))
			return false;
		return true;
	}
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
