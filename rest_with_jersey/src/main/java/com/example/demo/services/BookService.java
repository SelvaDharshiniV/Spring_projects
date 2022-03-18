package com.example.demo.services;
import java.util.*;
import com.example.demo.model.*;

public class BookService {

	private static BookService instance = new BookService();
	private static HashSet<Book> books;

	private BookService() {
		books = new HashSet<>();
		books.add(new Book(101, "Head first java",450,"Kathy Sieera"));
	}

	public static BookService getInstance() {
		return instance;
	}

	public List<Book> getAll() {
		return new ArrayList<>(books);
	}

	public boolean add(Book entity) {
		return books.add(entity);
	}

	public Book findById(int id) {

		Iterator <Book> itr = books.iterator();
		Book found = null;
		while(itr.hasNext()) {
			Book currentElement = itr.next();

			if(currentElement.getId()==id) {
				found = currentElement;
			}
		}
		return found;
	}

	public void removeById(int id) {
		Iterator <Book> itr = books.iterator();
		boolean found=false;
		Book elementToDeleted=null;
		while(itr.hasNext()) {
			Book currentElement = itr.next();
			if(currentElement.getId()==id) {
				found = true;
				elementToDeleted=currentElement;
			}		
		}
		if(found){
			books.remove(elementToDeleted);
		}else {
			throw new RuntimeException("Element not found");
		}
	}
	
	public void updateById( int id ,Book entity) {
		//		return books.add(entity);
		Iterator<Book> itr = books.iterator();
		Book elementToDeleted=null;
		boolean found=false;		
		while (itr.hasNext()) {
			Book currentElement = itr.next();
			if (currentElement.getId() == id) {
				found=true;
				elementToDeleted=currentElement;
			}
		}

		if(found){
			elementToDeleted.setAuthor(entity.getAuthor());
			elementToDeleted.setBookName(entity.getBookName());
			elementToDeleted.setPrice(entity.getPrice());
		}else {
			throw new RuntimeException("Element not found");
		}
	}
}
