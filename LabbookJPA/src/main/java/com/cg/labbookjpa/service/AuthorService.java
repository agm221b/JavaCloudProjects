package com.cg.labbookjpa.service;

import java.util.List;

import com.cg.labbookjpa.dto.Author;
import com.cg.labbookjpa.dto.Book;

public interface AuthorService {
	
	public Book insertBook(Book book);
	public int removeBook(Integer isbn);
	public List<Book> findAllBooks();
	public Book findBookByIsbn(Integer isbn);
	
	public Book findBookByAuthorId(Integer ID);
	public Author findAuthorByBookIsbn(Integer Isbn);
	
	
	public Author insertAuthor(Author author);
	public int removeAuthor(Integer ID);
	public List<Author> findAllAuthor();
	public Author findAuthorById(Integer ID);

}
