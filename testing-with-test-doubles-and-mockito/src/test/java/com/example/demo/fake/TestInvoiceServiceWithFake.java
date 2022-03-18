package com.example.demo.fake;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestInvoiceServiceWithFake {
	@DisplayName("Test InvoiceService class addInvoice method should return 0 if no element is present with the key else return 1 if there is already an element")
	@Test
	void testForAddSuccess() {
		InvoiceRepository invRepo= new FakeInvoiceRepository();
				
		InvoiceService service= new InvoiceService(invRepo);
		
		Invoice invoice=new Invoice(1010, "Ramesh", 450);

		int actual= service.addInvoice(invoice);
		int expected=0;
		assertEquals(actual,expected);
		
		int actual1= service.addInvoice(invoice);
		assertEquals(actual1,expected);
	}
	
//	if same key is added will return null... bcz hashmap doesn't allow duplicate key
	@DisplayName("test InvoiceService class addInvoice method should return 0 if no element is present with the key else return 1 if there is already an element")
	@Test
	void testForAddSuccessCheck() {
		InvoiceRepository invRepo= new FakeInvoiceRepository();
				
		InvoiceService service= new InvoiceService(invRepo);
		
		Invoice invoice=new Invoice(1011, "amesh", 50);

		int actual= service.addInvoice(invoice);
		int expected=1;
		assertEquals(actual,expected);
		
	}
}
