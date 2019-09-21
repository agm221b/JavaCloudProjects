package com.cg.labbookjpa.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cg.labbookjpa.dto.Author;
import com.cg.labbookjpa.dto.Book;
import com.cg.labbookjpa.service.AuthorService;
import com.cg.labbookjpa.service.AuthorServiceImpl;

public class MyApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome:");
		System.out.println("1: Add Book/ Author");
		System.out.println("2: View All");
		System.out.println("3: Remove Book/ Author");
		System.out.println("4: Find a Book or Author");
		System.out.println("5: Exit");

		AuthorService authorService = new AuthorServiceImpl();
		int choice = sc.nextInt();
		int isbn, id, noOfAuthors;
		String title, authorName;
		double price;
		switch (choice) {
		case 1:
			Book book = new Book();
			System.out.println("Enter the book's ISBN:");
			isbn = sc.nextInt();
			System.out.println("Enter the book's title:");
			title = sc.next();
			System.out.println("Enter the book's price:");
			price = sc.nextDouble();

			System.out.println("Enter the number of Authors");
			noOfAuthors = sc.nextInt();
			List<Author> authorList = new ArrayList<Author>();
			for (int i = 0; i < noOfAuthors; i++) {
				System.out.println("Enter the author's name");
				authorName = sc.next();
				System.out.println("Enter the author's ID");
				id = sc.nextInt();

				Author author = new Author();
				author.setID(id);
				author.setAuthorName(authorName);
				authorList.add(author);
			}

			
			book.setISBN(isbn);
			book.setTitle(title);
			book.setPrice(price);

			break;
		case 2:
			for (Author author2 : authorService.findAllAuthor()) {
				System.out.println(author2);
			}
			for (Book book2 : authorService.findAllBooks()) {
				System.out.println(book2);
			}
			break;
		default:

			break;
		}

	}

}
