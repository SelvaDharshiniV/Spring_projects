package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest 
{
//	static Greeting grtObj  ;
//	 Greeting grtObj  ;
//	@BeforeAll
//	public static void init() {
//		System.out.println("Before all");
////		grtObj= new Greeting();
//	}
//
//	@BeforeEach
//	public  void startUp() {
//		System.out.println("Before each");
//
//		grtObj= new Greeting();
//	}
//	@Test
//	public void testLengthOfGreetMessage() {
//		assertFalse( false );
//	}
//	@Test
//	public void testGreetMethodNotReturningNull() {
//		assertFalse( false );
//	}
	
//	@Test
//	public void testGreetMethodReturningNull() {
////		Greeting grtObj=new Greeting();
//		String actual=grtObj.getMessage();
//		assertNull(actual);
//	}
//	@Test
//	public void testGreetMethodNotReturningNull() {
////		Greeting grtObj=new Greeting();
//		String actual=grtObj.getMessage();
//		assertNotNull(actual);
//	}
//	@Test
//	@DisplayName(value = "To test the method returns a String with value Hello")
//	public void testGreetMethodReturnsString() {
////		Greeting grtObj=new Greeting();
//		String actual=grtObj.getMessage();
//		assertNotNull(actual);
//	}
	
	
	static CurrencyConverter obj  ;
	@BeforeAll
	public static void init() {
		System.out.println("Before all");
		obj= new CurrencyConverter();
	}
	
	@Test
	public void testUsdToInrMethodNotReturningNull() {
		Double actual=obj.usdToInr(50.0);
		assertNotNull(actual);
	}
	
	@Test
	public void testUsdToInrMethodNotNegative() {
		Double actual=obj.usdToInr(50);
		boolean value=actual>0;
//		Double expected=(obj.usdToInr(50.0))*(-1);
//		assertEquals(expected, actual);
		assertTrue(value);
	}

	@Test
	public void testUsdToInrMethodNotReturnsInt() {
		Double actual=obj.usdToInr(50);
		Integer expected=new Integer(50);
		assertNotEquals(expected.getClass(), actual.getClass());
	}
	
	@Test
	@DisplayName(value = "Test for method returns a value lesser than 100000")
	public void testUsdToInrMethodLength() {
		Double actual=obj.usdToInr(5066);
		assertTrue(actual<100000);
	}
}
