package com.cg.labbookjpa.service;

import java.util.List;

import com.cg.labbookjpa.dao.AuthorDao;
import com.cg.labbookjpa.dao.AuthorDaoImpl;
import com.cg.labbookjpa.dto.Author;
import com.cg.labbookjpa.dto.Book;

public class AuthorServiceImpl implements AuthorService {
	
	AuthorDao authorDao =  new AuthorDaoImpl();

	public Book insertBook(Book book) {
		// TODO Auto-generated method stub
		return authorDao.saveBook(book);
	}

	public int removeBook(Integer isbn) {
		// TODO Auto-generated method stub
		return authorDao.removeBook(isbn);
	}

	public List<Book> findAllBooks() {
		// TODO Auto-generated method stub
		return authorDao.findAllBook();
	}
//////////////////////////////////////////////////////////////////////////////////////////////////
	public Book findBookByIsbn(Integer isbn) {
		// TODO Auto-generated method stub
		return null;
	}

	public Book findBookByAuthorId(Integer ID) {
		// TODO Auto-generated method stub
		return null;
	}

	public Author findAuthorByBookIsbn(Integer Isbn) {
		// TODO Auto-generated method stub
		return null;
	}
//////////////////////////////////////////////////////////////////////////////////////////////////
	public Author insertAuthor(Author author) {
		// TODO Auto-generated method stub
		return authorDao.saveAuthor(author);
	}

	public int removeAuthor(Integer ID) {
		// TODO Auto-generated method stub
		return authorDao.removeAuthor(ID);
	}

	public List<Author> findAllAuthor() {
		// TODO Auto-generated method stub
		return authorDao.findAllAuthor();
	}

	public Author findAuthorById(Integer ID) {
		// TODO Auto-generated method stub
		return authorDao.findAuthorById(ID);
	}

}
