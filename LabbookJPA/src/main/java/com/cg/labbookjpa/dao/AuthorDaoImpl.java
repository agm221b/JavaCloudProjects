package com.cg.labbookjpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cg.labbookjpa.dto.Author;
import com.cg.labbookjpa.dto.Book;

public class AuthorDaoImpl implements AuthorDao {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	static {
		entityManagerFactory = Persistence.createEntityManagerFactory("labbookjpa");
		entityManager = entityManagerFactory.createEntityManager();

	}

	public AuthorDaoImpl() {

	}

	public Author saveAuthor(Author author) {
		// TODO Auto-generated method stub
		// Author authorSave = entityManager.find(Author.class, author.getID());
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		List<Book> bookList = author.getBookList();
		for (Book book : bookList) {
			book.getAuthorList().add(author);
		}
		// author.setBookList(bookList);
		entityManager.persist(author);
		entityTransaction.commit();
		return author;
	}

	public int removeAuthor(Integer id) {
		// TODO Auto-generated method stub
		Author author = entityManager.find(Author.class, id);
		EntityTransaction entityTransaction = entityManager.getTransaction();
		if (author != null) {

			entityTransaction.begin();

			List<Book> bookList = author.getBookList();
			for (Book book : bookList) {
				book.getAuthorList().remove(author);

				entityManager.remove(author);

			}
			entityTransaction.commit();
		}
		return 1;
	}

	public List<Author> findAllAuthor() {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("FROM Author");
		List<Author> authorList = query.getResultList();
		return authorList;
	}

	public Author findAuthorById(Integer id) {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("FROM Author WHERE id= :authorId");
		query.setParameter("authorId", id);
		Author author = (Author) query.getSingleResult();
		return author;
	}

	public Book saveBook(Book book) {
		// TODO Auto-generated method stub
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		List<Author> authorList = book.getAuthorList();
		for (Author author : authorList) {
			author.getBookList().add(book);
		}
		entityManager.persist(book);
		entityTransaction.commit();
		return book;
	}

	public int removeBook(Integer isbn) {
		// TODO Auto-generated method stub
		Book book = entityManager.find(Book.class, isbn);
		EntityTransaction entityTransaction = entityManager.getTransaction();
		if (book != null) {

			entityTransaction.begin();

			List<Author> authorList = book.getAuthorList();
			for (Author author : authorList) {
				author.getBookList().remove(book);

				entityManager.remove(book);

			}
			entityTransaction.commit();
		}
		return 1;
	}

	public List<Book> findAllBook() {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("FROM Book");
		List<Book> bookList = query.getResultList();
		return bookList;
	}

	public Book findBookByISBN(Integer isbn) {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("FROM Book WHERE isbn= :isbn");
		query.setParameter("isbn", isbn);
		Book book = (Book) query.getSingleResult();
		return book;
	}

}
