package com.ojas._17SpringMVCWithJSP.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import com.ojas._17SpringMVCWithJSP.model.Book;

public class BookMapper implements RowMapper<Book> {

	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		Book book = new Book();
		book.setBookId(rs.getInt("bookId"));
		book.setBookName(rs.getString("bookName"));
		book.setBookAuthor(rs.getString("bookAuthor"));
		book.setBookPrice(rs.getString("bookPrice"));
		return book;
	}

}
