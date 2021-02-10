package org.legendtitans.bookstore;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class BookStoreRunner {

	private static ArrayList<Book> yourBooks = new ArrayList<Book>();
	private static ArrayList<Book> availableBooks = new ArrayList<Book>();
	private static Scanner k = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	
		listAvailableBooks();
		
		int choice = determineBookSelection();
		addToYourBooks(choice);
		
		System.out.println("\nYour Book: ");
		System.out.println(yourBooks.get(0).getName());
	}
	
	public static void addAllBooks() {
		Book book1 = new Book("To Kill A Mockingbird", "123213");
		Book book2 = new Book("To Kill A Dolphin", "32423451");
		Book book3 = new Book("To Kill A Shark", "15462345");
		Book book4 = new Book("To Kill A Dragon", "2452435");
		Book book5 = new Book("To Kill A Human", "012324524127");
		Book book6 = new Book("To Kill A Snake", "0123128");
		Book book7 = new Book("To Kill A Bear", "254520123123");
		Book book8 = new Book("To Kill A Wolf", "2542452435");
		Book book9 = new Book("To Kill A Machine", "2452254");
		Book book10 = new Book("To Kill A Government", "13485913");
		
		
		availableBooks.add(book1);
		availableBooks.add(book2);
		availableBooks.add(book3);
		availableBooks.add(book4);
		availableBooks.add(book5);
		availableBooks.add(book6);
		availableBooks.add(book7);
		availableBooks.add(book8);
		availableBooks.add(book9);
		availableBooks.add(book10);

	}
	
	public static void listAvailableBooks() {
		addAllBooks();
		int bookNumber = 1;
		
		for(Book book : availableBooks) {
			System.out.println("Book "+bookNumber+": "+ book.getName()+" - ISBN: "+ book.getIsbn());
			bookNumber++;
		}
		 
	}
	public static int determineBookSelection() {
		System.out.println("\n\nWhich book would you like to check out?");
		int choice = k.nextInt()-1;
		if(choice >= availableBooks.size()) {
			while(choice>=availableBooks.size()) {
			System.out.println("\nInvalid Choice, try again\n\nWhich book would you like to check out?");
			 choice = k.nextInt()-1;
			}
			return choice;
		}
		return choice;
		
		
	}
	public static void addToYourBooks(int choice) {
		yourBooks.add(availableBooks.get(choice));
		availableBooks.remove(choice);
	}

}
