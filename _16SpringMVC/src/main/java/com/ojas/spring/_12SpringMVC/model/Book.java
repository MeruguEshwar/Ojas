package com.ojas.spring._12SpringMVC.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

	private int bookId;
	private String bookName;
	private String bookPrice;
	private String bookAuthor;
}
