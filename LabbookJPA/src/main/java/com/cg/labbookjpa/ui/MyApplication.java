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
		int isbn, id, noOfAuthors, flag = 1;
		String title, authorName;
		double price;
		label: while (true) {
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
					authorService.insertAuthor(author);
				}

				book.setAuthorList(authorList);
				book.setISBN(isbn);
				book.setTitle(title);
				book.setPrice(price);
				authorService.insertBook(book);
				break;
			case 2:
				for (Author author2 : authorService.findAllAuthor()) {
					System.out.println(author2);
				}
				for (Book book2 : authorService.findAllBooks()) {
					System.out.println(book2);
				}
				break;
			case 5:
				System.out.println("Are you sure you want to exit: (yes/no)");
				String check = sc.next();
				if (check.equalsIgnoreCase("yes"))
					flag = 0;
				else if (check.equalsIgnoreCase("no"))
					flag = 1;
				break;
			default:
				System.out.println("Wrong choice, enter between 1-5");

				break;
			}
			if (flag == 1)
				continue label;
		}
	}
}
