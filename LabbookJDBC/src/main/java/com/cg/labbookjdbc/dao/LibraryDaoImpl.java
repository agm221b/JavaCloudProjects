package com.cg.labbookjdbc.dao;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.cg.labbookjdbc.dto.Author;
import com.cg.labbookjdbc.dto.Book;
import com.cg.labbookjdbc.exception.AuthorException;
import com.cg.labbookjdbc.util.DBUtil;
import com.mysql.jdbc.Statement;

public class LibraryDaoImpl implements LibraryDao {

	private static Connection connection;
	private PreparedStatement ps;
	private ResultSet rs;
	private static Logger myLogger;

	static {

		Properties props = System.getProperties();
		String userDir = props.getProperty("user.dir") + "/src/main/resources/";
		System.out.println("Current working directory is " + userDir);
		PropertyConfigurator.configure(userDir + "/log4j.properties");
		myLogger = Logger.getLogger("DBUtil.class");

		try {
			connection = DBUtil.getConnection();
			myLogger.info("connection obtained");

		} catch (AuthorException e) {
			// TODO: handle exception
			myLogger.error("connection not obtained at EmployeeDao: " + e);
		}
	}

	public Author addAuthor(Author author) throws AuthorException {
		// TODO Auto-generated method stub
		String sql = "insert into author(first_name,middle_name,last_name,phone_No) values(?,?,?,?)";
		try {
			ps = connection.prepareStatement(sql);

			ps.setString(1, author.getFirstName());
			ps.setString(2, author.getMiddleName());
			ps.setString(3, author.getLastName());
			ps.setLong(4, author.getPhoneNo().longValue());

			int noOfRecs = ps.executeUpdate();
			rs = ps.getGeneratedKeys();

			BigInteger generatedId = BigInteger.valueOf(0L);
			// System.out.println("Autogenerated ID is: "+generatedId);

			if (rs.next()) {
				generatedId = BigInteger.valueOf(rs.getLong(1));
				System.out.println("Autogenerated ID is: " + generatedId);
			}

			author.setAuthorId(generatedId);
		} catch (Exception e) {
			myLogger.error("Error in AddAuthor: " + e);
			throw new AuthorException("Error in AddAuthor: " + e);
			// TODO: handle exception
		}
		return author;
	}

	public int deleteAuthor(BigInteger authorId) throws AuthorException {
		// TODO Auto-generated method stub
		String sql = "delete from author where author_Id = ?";
		int val;
		try {
			ps = connection.prepareStatement(sql);
			ps.setLong(1, authorId.longValue());

			val = ps.executeUpdate();
		} catch (SQLException e) {
			myLogger.error("Error in deleteAuthor method" + e);
			throw new AuthorException("Error in deleteAuthor method" + e);
			// TODO: handle exception
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO: handle exception
					System.out.println("Error at deleteAuthor method: " + e);
				}
			}
		}
		if (val > 0)
			return 1;
		else
			return 0;
	}

	public Author findAuthor(BigInteger authorId) throws AuthorException {
		// TODO Auto-generated method stub
		String sql = "select * from author where author_Id= ?";
		Author author = new Author();
		;
		try {
			ps = connection.prepareStatement(sql);
			ps.setLong(1, authorId.longValue());

			rs = ps.executeQuery();

			while (rs.next()) {

				author.setAuthorId(BigInteger.valueOf(rs.getLong("author_id")));
				author.setFirstName(rs.getString("first_name"));
				author.setMiddleName(rs.getString("middle_name"));
				author.setLastName(rs.getString("last_name"));
				author.setPhoneNo(BigInteger.valueOf(rs.getLong("phone_no")));
				// return author;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			myLogger.error("Error in findAuthor : " + e);
			throw new AuthorException("Error in findAuthor : " + e);
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO: handle exception
					myLogger.error("Error in findAuthor : " + e);
					throw new AuthorException("Error in findAuthor : " + e);
				}
			}
		}

		return author;
	}

	public Author updateAuthor(BigInteger authorId, Author author) throws AuthorException {
		// TODO Auto-generated method stub
		String sql = "update author set first_name= ?, middle-name= ?, last_name= ?, phone_no= ? where author_id= ?";
		int result;
		try {
			ps = connection.prepareStatement(sql);
			ps.setString(1, author.getFirstName());
			ps.setString(2, author.getMiddleName());
			ps.setString(3, author.getLastName());
			ps.setLong(4, author.getPhoneNo().longValue());
			ps.setLong(5, author.getAuthorId().longValue());

			result = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			myLogger.error("Error in findAuthor : " + e);
			throw new AuthorException("Error in findAuthor : " + e);
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO: handle exception
					myLogger.error("Error in findAuthor : " + e);
					throw new AuthorException("Error in findAuthor : " + e);
				}
			}
		}
		if (result > 0)
			System.out.println("Author is added");
		else
			System.out.println("Author not added");
		return author;
	}

	@Override
	public List<Book> findBookByAuthorId(BigInteger authorId) throws AuthorException {
		// TODO Auto-generated method stub
		String sql = "select * from Library where author_id =?";
		Book book = new Book();
		List<Book> listBooks = new ArrayList<Book>();

		try {
			ps = connection.prepareStatement(sql);
			ps.setLong(1, authorId.longValue());

			rs = ps.executeQuery();
			if (rs.next()) {
				book.setIsbn(BigInteger.valueOf(rs.getLong("isbn")));
				book.setTitle(rs.getString("title"));
				book.setPrice(rs.getDouble("price"));
				listBooks.add(book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			myLogger.error("Error in findBookByAuthor : " + e);
			throw new AuthorException("Error in findBookByAuthor : " + e);
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO: handle exception
					myLogger.error("Error in findBookByAuthor : " + e);
					throw new AuthorException("Error in findBookByAuthor : " + e);
				}
			}
		}

		return listBooks;
	}

	@Override
	public int updateBook(String firstName, double price) throws AuthorException {
		// TODO Auto-generated method stub
		String sql = "update book set price=? where isbn=(select isbn from library where author_id=(select author_id from author where first_name=?))";
		int flag = 0;
		try {
			ps = connection.prepareStatement(sql);
			ps.setDouble(1, price);
			ps.setString(2, firstName);

			flag = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			myLogger.error("Error in UpdatePrice : " + e);
			throw new AuthorException("Error in UpdatePrice : " + e);
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO: handle exception
					myLogger.error("Error in UpdatePrice : " + e);
					throw new AuthorException("Error in UpdatePrice : " + e);
				}
			}
		}

		return flag;
	}

	@Override
	public int insertBookAndAuthor(Book book, Author author) throws AuthorException {
		// TODO Auto-generated method stub
		String sql = "insert into author(first_name,middle_name,last_name,phone_no) values (?,?,?,?)";
		String sql2 = "insert into book(title,price) values (?,?)";
		String sql3 = "insert into library(isbn,author_id) values (?,?)";

		try {
			ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, author.getFirstName());
			ps.setString(2, author.getMiddleName());
			ps.setString(3, author.getLastName());
			ps.setLong(4, author.getPhoneNo().longValue());

			ps.executeUpdate();
			
			rs = ps.getGeneratedKeys();
			BigInteger authorId = BigInteger.valueOf(rs.getLong("author_id"));
			author.setAuthorId(authorId);

			ps = connection.prepareStatement(sql2, Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, book.getTitle());
			ps.setDouble(2, book.getPrice());
			
			ps.executeUpdate();
			
			rs = ps.getGeneratedKeys();
			BigInteger isbn = BigInteger.valueOf(rs.getLong("isbn"));
			book.setIsbn(isbn);
			
			ps = connection.prepareStatement(sql3);
			ps.setLong(1, book.getIsbn().longValue());
			ps.setLong(2, author.getAuthorId().longValue());
			
			ps.executeUpdate();
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			myLogger.error("Error in insertBookAndAuthor : " + e);
			throw new AuthorException("Error in insertBookAndAuthor : " + e);
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO: handle exception
					myLogger.error("Error in insertBookAndAuthor : " + e);
					throw new AuthorException("Error in insertBookAndAuthor : " + e);
				}
			}
		}

		return 0;
	}

}
