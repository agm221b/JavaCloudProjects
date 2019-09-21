package com.cg.labbookjpa.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Book {
	@Id
	private Integer isbn;
	private String title;
	private Double price;
	@ManyToMany
	private List<Author> authorList;
	
	
	public Integer getISBN() {
		return isbn;
	}
	public void setISBN(Integer isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public List<Author> getAuthorList() {
		return authorList;
	}
	public void setAuthorList(List<Author> authorList) {
		this.authorList = authorList;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Book other = (Book) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(Integer iSBN, String title, Double price) {
		super();
		isbn = iSBN;
		this.title = title;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book \n[ISBN=" + isbn + ",\n title=" + title + ",\n price=" + price + "]";
	}
	
	

}
