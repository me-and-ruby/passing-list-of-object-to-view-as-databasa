package com.datapp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.datapp.entities.Book;
@Controller
public class BookController {
	
	@RequestMapping("/bookpage")
	public String bookPage(ModelMap model) {
		//create  a list of 7 object from book
		List<Book> books = new ArrayList<Book>();
		books.add(new Book("101","Java for dummies","Become a programmer overnight"));
		books.add(new Book("102","C++ for newbies","Learning C++ for kids"));
		books.add(new Book("103","Python for everybody","Learn python in one day"));
		books.add(new Book("104","Spring boot study guide","learn spring boot if you can"));
		books.add(new Book("105","JEE","Become a programmer overnight"));
		books.add(new Book("106","Hadhoop study guide","Learn Data sciance "));
		books.add(new Book("107","React for everybody","Become a React developer overnight"));
		
		model.put("books", books);
		
		return "bookpage.jsp";
	}

}
