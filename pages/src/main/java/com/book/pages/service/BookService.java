package com.book.pages.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.pages.entity.Book;
import com.book.pages.entity.Pages;
import com.book.pages.repository.BookRepository;
import com.book.pages.repository.PagesRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private PagesRepository pagesRepository;

	public String save(Book book) {

		book=bookRepository.save(book);

		for (Pages obj : book.getPages()) {
			obj.setBook(book);
			obj=pagesRepository.save(obj);

		}
		return "success";

	}

}
