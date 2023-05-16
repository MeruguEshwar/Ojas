package com.ojas._17SpringMVCWithJSP.Dao;

import java.util.List;

import com.ojas._17SpringMVCWithJSP.model.Book;

public interface BookDao {

	boolean CreateBooks(Book book);

	List<Book> getAllBooks();

	String UpdateBook(Book book);

	boolean DeleteBook(Book book);
}
