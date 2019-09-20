package com.cg.labbookjpa.dto;

import javax.persistence.Column;
import javax.persistence.Id;

public class Author {
	@Id
	private Integer ID;
	private String author;
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author(Integer iD, String author) {
		super();
		ID = iD;
		this.author = author;
	}
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ID == null) ? 0 : ID.hashCode());
		result = prime * result + ((author == null) ? 0 : author.hashCode());
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
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Author [ID=" + ID + ", author=" + author + "]";
	}
	
}
