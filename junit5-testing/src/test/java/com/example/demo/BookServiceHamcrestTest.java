package com.example.demo;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.demo.services.BookService;
public class BookServiceHamcrestTest {
	static BookService service  ;
	@BeforeAll
	public static void init() {
		service= new BookService();
	}
	
	@DisplayName(value = "Test Book Class has a Property author")
	@Test
	void testBookHasAuthorProp() {
		
		Book book = new Book();
		
		assertThat(book,hasProperty("author"));
	}
	@DisplayName(value = " getBook Method Book Service should return a book with price less than 100 for book with id 101")
	@Test
	void testPriceOfFirstBook() {
		
		Book actual = service.getBook(1);
		double book=actual.getPrice();
		assertThat(book,is(lessThan(100.00)));
	}
}
