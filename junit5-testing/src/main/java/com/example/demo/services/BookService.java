package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.Book;

public class BookService {
	static int count=0;
	public double getDiscount(Book book) {
		boolean status=true;
		double discount=0.05;
		while(status) {
		if(book.getPrice()<=200) {
			discount=0.10;
		}else if(book.getPrice()>200&& book.getPrice()<=500) {
			discount=0.15;
		}
		count++;
		if(count>100) {
			status=false;
		}
		}
		return discount;
	}
	public Book getBook(int key) {
		if(key>0){
			switch (key) {
			case 1:
				return new Book(100,"java",120);
			case 2:
				return new Book(101,"spring",200);
			case 3:
				return new Book(102,"react",800);
			default:
				return null;
			}	
		}
		else {
			throw new RuntimeException();
		}
	}
	public List<Book> getAllBooks() {
			ArrayList<Book> list= new ArrayList<Book>();
			Book java=new Book(101, "java", 200);
			Book spring= new Book(101,"spring",120);
			Book react= new Book(102,"react",320);
			Book php= new Book(103,"php",230);
			Book sql= new Book(104,"sql",500);
			Book html= new Book(105,"html",110);
			list.add(java);
			list.add(spring);
			list.add(react);
			list.add(php);
			list.add(sql);
			list.add(html);
			return list;
	}
}
