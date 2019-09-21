package com.cg.labbookjpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.labbookjpa.dto.Author;
import com.cg.labbookjpa.dto.Book;

public class AuthorDaoImpl implements AuthorDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("labbookjpa");
	EntityManager entityManager;

	public AuthorDaoImpl() {
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
	}

	EntityTransaction entityTransaction;

	public Author saveAuthor(Author author) {
		// TODO Auto-generated method stub
		// Author authorSave = entityManager.find(Author.class, author.getID());
		List<Book> bookList = author.getBookList();
		for (Book book : bookList) {
			Book book2 = entityManager.find(Book.class, book.getISBN());
			if (book2 != null) {
				int bookIndex = bookList.indexOf(book2);
				bookList.add(bookIndex, book2);

			}
			else
			{
				saveBook(book);
			}

		}
		author.setBookList(bookList);

		beginTransaction();
		entityManager.persist(author);
		commitTransaction();
		return null;
	}

	public int removeAuthor(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Author> findAllAuthor() {
		// TODO Auto-generated method stub
		return null;
	}

	public Author findAuthorById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Book saveBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	public int removeBook(Integer isbn) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Book> findAllBook() {
		// TODO Auto-generated method stub
		return null;
	}

	public Book findBookByISBN(Integer isbn) {
		// TODO Auto-generated method stub
		return null;
	}

	public void beginTransaction() {
		// TODO Auto-generated method stub
		entityTransaction.begin();

	}

	public void commitTransaction() {
		// TODO Auto-generated method stub
		entityTransaction.commit();

	}

}
