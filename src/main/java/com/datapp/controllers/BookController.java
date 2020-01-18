package com.datapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class BookController {
	
	@RequestMapping()
	public String bookPage() {
		return "bookpage";
	}

}
