package com.datapp.entities;

public class Book {
	private String id;
	private String bookName;
	private String description;
	
	
	
	public Book() {
		
	}



	public Book(String id, String bookName, String description) {
		
		this.id = id;
		this.bookName = bookName;
		this.description = description;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getBookName() {
		return bookName;
	}



	public void setBookName(String bookName) {
		this.bookName = bookName;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	
	
	
	
	

}
