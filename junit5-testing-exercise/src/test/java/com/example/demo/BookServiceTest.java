package com.example.demo;
import static java.time.Duration.ofMillis;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.example.demo.services.BookService;
//1. get book method should not return null value for choices upto 3;
//2. get book method should not return null value for choices above 3
//3. get book method must throw RunTimeException when the input value is negative number
//4. getDiscount method should return 0.10 discount for price less than or equal to 200.
//5. getDiscount method should return 0.15 discount for price greater than 200 and lesser than or equal to 500
//6. getDiscount method should be completed with 100ms
public class BookServiceTest {

	private BookService service  ;
	@BeforeAll
	public static void init() {
//		System.out.println("Before all called");
	}
	@BeforeEach
	public  void startUp() {
//		System.out.println(" Before each called");
		service= new BookService();
	}

	@Test
	@DisplayName("getBook method should not return null values for choices 1,2,3")
	public void testGetBookMethodNotNull() {
//		System.out.println("  Dummy test one called");
//		Book actual= service.getBook(2);
//		assertNotNull(actual);
		assertAll("getBook method with choice 1 to 3",
					()-> assertNotNull(service.getBook(1)),
					()-> assertNotNull(service.getBook(2)),
					()-> assertNotNull(service.getBook(3))
				 );
	}
	@ParameterizedTest
	@ValueSource(ints= {1,2,3})
	void testGetBookMethodWithParams(int key) {
		assertNotNull(service.getBook(key));
	}
	@Test
	@DisplayName("getBook method should return null value for choices above 3")
	public void testGetBookMethodReturnNull() {
		assertNull(service.getBook(4));
	}
	@Test
	public void testForException() {
		Throwable exception= 
		assertThrows(RuntimeException.class, ()-> 
			service.getBook(-2));
	}
	@Test
	@DisplayName("getDiscount method should return 0.10 discount for price less than or equal to 200.")
	public void testForTenPercentDiscount() {
		Book book= service.getBook(1);
		double actual= service.getDiscount(book);
		double expected=0.10;
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName(" getDiscount method should be completed with 100ms")
	public void testGetBookComplitionTiming() {
		Book book= service.getBook(3);
		double actual= service.getDiscount(book);
		double expected=0.15;
		assertTimeout(Duration.ofMillis(100),() -> service.getDiscount(book));
		assertEquals(expected, actual);
	}
	@DisplayName(value="getDiscount method ")
	@Test
	@Disabled("Disabled till timeout bug in the method if fixed")
	public void testGetBookTestFivePercentDiscount() {
		Book book= service.getBook(1);
		double actual= service.getDiscount(book);
		double expected=0.05;
		assertEquals(expected, actual);
	}
	@DisplayName(value="GetAllBooks method should return a list with index position 1,3,5 not being null ")
	@ParameterizedTest
	@ValueSource(ints= {1,3,5})
	public void testGetAllBooksPosition(int key) {
		List<Book> actual=service.getAllBooks();
		assertNotNull(actual.get(key));
//		assertFalse(true,"Not yet implemented");
	}
	@AfterAll
	public static void destory() {
//		System.out.println("After All called");
	}
	@AfterEach
	public void tearEach() {
//		System.out.println(" After Each called");
	}

}
