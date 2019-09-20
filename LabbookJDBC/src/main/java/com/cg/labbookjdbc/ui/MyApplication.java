/**
 * 
 */
package com.cg.labbookjdbc.ui;

import java.math.BigInteger;
import java.util.Scanner;

import com.cg.labbookjdbc.dao.LibraryDao;
import com.cg.labbookjdbc.dao.LibraryDaoImpl;
import com.cg.labbookjdbc.dto.Author;
import com.cg.labbookjdbc.dto.Book;
import com.cg.labbookjdbc.exception.AuthorException;

/**
 * @author User
 *
 */
public class MyApplication {

	/**
	 * @param args
	 * @throws AuthorException 
	 */
	public static void main(String[] args) throws AuthorException {
		// TODO Auto-generated method stub
		LibraryDao libraryDao = new LibraryDaoImpl();

		Scanner sc = new Scanner(System.in);
		int choice =0;
		int flag=0;
		System.out.println("Welcome to Author Menu: \n\n\n");
		while(choice!=5) {
			System.out.println("Press 1 for Adding Author");
			System.out.println("Press 2 for Deleting Author");
			System.out.println("Press 3 for Updating Author");
			System.out.println("Press 4 for Searching Author");
			System.out.println("Press 5 for Finding Book by Author ID");
			System.out.println("Press 6 for Update Price of Books by Author Name");
			System.out.println("Press 7 for Adding New Book and Author");
			
			
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the first name");
				String firstName = sc.next();
				System.out.println("Enter the middle name");
				String middleName = sc.next();
				System.out.println("Enter the last name");
				String lastName = sc.next();
				System.out.println("Enter the phone number");
				BigInteger phoneNo = sc.nextBigInteger();

				Author author = new Author(firstName, middleName, lastName, phoneNo);
				libraryDao.addAuthor(author);

				break;

			case 2: 
				System.out.println("Enter the Author ID of the author to delete");
				BigInteger authorId = sc.nextBigInteger();
				if(libraryDao.deleteAuthor(authorId)==1)
					System.out.println("Deleted Successfully");
				else
					System.out.println("Unsuccessful");
				break;

			case 3: 
				System.out.println("Enter the Author ID of the author to update");
				authorId = sc.nextBigInteger();
				System.out.println("Enter the first name");
				firstName = sc.next();
				System.out.println("Enter the middle name");
				middleName = sc.next();
				System.out.println("Enter the last name");
				lastName = sc.next();
				System.out.println("Enter the phone number");
				phoneNo = sc.nextBigInteger();
				author = new Author(firstName, middleName, lastName, phoneNo);
				System.out.println(libraryDao.updateAuthor(authorId, author));
				break;

			case 4: 
				System.out.println("Enter the author ID of author to search");
				authorId= sc.nextBigInteger();

				System.out.println(libraryDao.findAuthor(authorId));
				break;

			case 5://authorId - search
				System.out.println("Enter the author ID");
				authorId = sc.nextBigInteger();

				for (Book books : libraryDao.findBookByAuthorId(authorId)) {
					System.out.println(books+"\n");
				}

				break;
			case 6://firstName and price 
				System.out.println("Enter the first name");
				firstName = sc.next();
				System.out.println("Enter the price");
				double price = sc.nextDouble();

				if(libraryDao.updateBook(firstName, price)>0)
					System.out.println("Records updated");

				break;
			case 7://add all but isbn and authorId
				System.out.println("Enter the first name");
				firstName = sc.next();
				System.out.println("Enter the middle name");
				middleName = sc.next();
				System.out.println("Enter the last name");
				lastName = sc.next();
				System.out.println("Enter the phone number");
				phoneNo = sc.nextBigInteger();
				
				System.out.println("Enter the book title");
				String title = sc.next();
				System.out.println("Enter the price");
				price = sc.nextDouble();

				author = new Author(firstName, middleName, lastName, phoneNo);
				Book book = new Book();
				book.setTitle(title);
				book.setPrice(price);
				
				libraryDao.insertBookAndAuthor(book, author);
				//libraryDao.addAuthor(author);

				break;
			case 8: System.out.println("Exiting");
			flag=1;

			default: System.out.println("Wrong input");
			break;
			}
			if(flag==1)
				break;		
		}
	}

}
