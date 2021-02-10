package org.legendtitans.bookstore;

public class Book {

	private String name;
	private String isbn;
	
	public Book(String n, String isbn) {
		name = n;
		this.isbn = isbn;
	}
	
	public String getName() {		
		return name;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setName(String n) {
		name = n;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	//COMMENT Updated
}
