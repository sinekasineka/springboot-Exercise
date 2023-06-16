package com.book.pages.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.pages.entity.Book;
import com.book.pages.service.BookService;

@RestController

public class BookController {
	
	@Autowired
	private BookService bookService;

	@PostMapping("/save")
	private String save(@RequestBody Book book) {
		bookService.save(book);
		return "ok";

	}

}
