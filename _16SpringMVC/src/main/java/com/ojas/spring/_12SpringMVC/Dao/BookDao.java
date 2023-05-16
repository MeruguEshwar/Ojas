package com.ojas.spring._12SpringMVC.Dao;

import java.util.List;

import com.ojas.spring._12SpringMVC.model.Book;

public interface BookDao {

	boolean CreateBooks(Book book);

	List<Book> getAllBooks();

	String UpdateBook(Book book);

	boolean DeleteBook(Book book);
}
