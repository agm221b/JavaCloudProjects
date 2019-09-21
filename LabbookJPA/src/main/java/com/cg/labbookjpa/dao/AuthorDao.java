package com.cg.labbookjpa.dao;

import java.util.List;

import com.cg.labbookjpa.dto.Author;
import com.cg.labbookjpa.dto.Book;

public interface AuthorDao {
	
	public Author saveAuthor(Author author);
	public int removeAuthor(Integer id);
	public List<Author> findAllAuthor();
	public Author findAuthorById(Integer id);
	
	public Book saveBook(Book book);
	public int removeBook(Integer isbn);
	public List<Book> findAllBook();
	public Book findBookByISBN(Integer isbn);
	
	public void beginTransaction();
	public void commitTransaction();
	

}
