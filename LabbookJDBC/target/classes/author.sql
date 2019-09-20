CREATE DATABASE IF NOT EXISTS testdb; 	

USE testdb;
/*
 * private BigInteger authorId;
	private String firstName;
	private String middleName;
	private String lastName;
	private BigInteger phoneNo;
 */
CREATE TABLE IF NOT EXISTS author 
	(
		author_Id bigint AUTO_INCREMENT,
		first_Name varchar(50) NOT NULL ,
		middle_Name varchar(50) NOT NULL ,
		last_Name varchar(50) NOT NULL,
		phone_No bigint NOT NULL,
		CONSTRAINT pk_author_id PRIMARY KEY(author_Id)
	);
	
CREATE TABLE IF NOT EXISTS Book 
	(
		isbn bigint AUTO_INCREMENT PRIMARY KEY,
		title varchar(50) NOT NULL,
		price decimal NOT NULL
	);
	
CREATE TABLE IF NOT EXISTS Library 
	(
		isbn bigint REFERENCES Book(isbn),
		author_id bigint REFERENCES author(author_id)
	);