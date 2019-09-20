/**
 * 
 */
package com.cg.labbookjdbc.dto;

import java.math.BigInteger;

/**
 * @author User
 *
 */
public class Book {
	
	private BigInteger isbn;
	private String title;
	private double price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(BigInteger isbn, String title, double price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.price = price;
	}
	public BigInteger getIsbn() {
		return isbn;
	}
	public void setIsbn(BigInteger isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Book \n[isbn=" + isbn + ",\n title=" + title + ",\n price=" + price + "]";
	}
	
	

}
