package com.ojas._17SpringMVCWithJSP.Dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.ojas._17SpringMVCWithJSP.model.Book;


@Component
public class BookImpl implements BookDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean CreateBooks(Book book) {
		return jdbcTemplate.update("insert into courses values (?,?,?,?)", book.getBookId(), book.getBookName(),
				book.getBookAuthor(), book.getBookPrice()) > 0;
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String UpdateBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean DeleteBook(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

}
