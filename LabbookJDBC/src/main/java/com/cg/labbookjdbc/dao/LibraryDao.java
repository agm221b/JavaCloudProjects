/**
 * 
 */
package com.cg.labbookjdbc.dao;

import java.math.BigInteger;
import java.util.List;

import com.cg.labbookjdbc.dto.Author;
import com.cg.labbookjdbc.dto.Book;
import com.cg.labbookjdbc.exception.AuthorException;

/**
 * @author User
 *
 */
public interface LibraryDao {
	
	public Author addAuthor(Author author) throws AuthorException;
	public int deleteAuthor(BigInteger authorId) throws AuthorException;
	public Author findAuthor(BigInteger authorId) throws AuthorException;
	public Author updateAuthor(BigInteger authorId, Author author) throws AuthorException;
	
	public List<Book> findBookByAuthorId(BigInteger authorId) throws AuthorException;
	public int updateBook(String firstName, double price) throws AuthorException;
	public int insertBookAndAuthor(Book book, Author author) throws AuthorException;
	
	/*
	 * public Author addAuthor(Author author) throws AuthorException; public int
	 * deleteAuthor(BigInteger authorId) throws AuthorException; public Author
	 * findAuthor(BigInteger authorId) throws AuthorException; public Author
	 * updateAuthor(BigInteger authorId, Author author) throws AuthorException;
	 */

}
