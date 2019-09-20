package Lab2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the book title:");
		String title = sc.nextLine();
		System.out.println("Enter the ID number:");
		int id =sc.nextInt();
		System.out.println("Enter the number of copies:");
		int noOfCopies = sc.nextInt();
		//
		sc.nextLine();
		//
		System.out.println("Enter the author:");
		String author =sc.nextLine();
		
		Book b1 = new Book(id,noOfCopies, title,author);
		
		System.out.println("Title is : "+b1.getTitle());
		System.out.println("ID is : "+b1.getId());
		System.out.println("No of copies is/are : "+b1.getNoOfCopies());
		System.out.println("Author is : "+b1.getAuthor());
		
		
		
	}
	

}
