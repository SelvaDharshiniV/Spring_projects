package com.example.demo.entity;

import com.example.demo.annotation.MyColumn;
import com.example.demo.annotation.MyTable;

@MyTable(name = "sd_book")
public class Book {
	@MyColumn(name = "booknumber")
	private int bookNumber;

	public Book() {
		super();
	}

	public int getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	
}
