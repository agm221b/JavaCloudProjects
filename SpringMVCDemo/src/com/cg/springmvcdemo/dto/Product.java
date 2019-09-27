package com.cg.springmvcdemo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "product_db")
public class Product {
	@Id
	@Column(name = "prod_id")
	@NotNull(message = "ID cannot be null")
	private Integer prodId;
	@Column(name = "prod_name")
	@NotEmpty(message = "Name cannot be empty")
	@Size(min = 3, max = 20, message = "Name must be between 3 to 20 characters")
	private String prodName;
	@Column(name = "prod_price")
	@NotNull(message = "Price cannot be empty")
	private Double prodPrice;
	private String features;
	private String type;
	private String online;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Integer getProdId() {
		return prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public Double getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(Double prodPrice) {
		this.prodPrice = prodPrice;
	}

	public String getFeatures() {
		return features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOnline() {
		return online;
	}

	public void setOnline(String online) {
		this.online = online;
	}

	public Product(Integer prodId, String prodName, Double prodPrice, String features, String type, String online) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.features = features;
		this.type = type;
		this.online = online;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodPrice=" + prodPrice + ", features="
				+ features + ", type=" + type + ", online=" + online + "]";
	}
	
	
}
