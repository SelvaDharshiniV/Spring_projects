package com.example.demo.stub;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestInvoiceServiceWothStub {
	@DisplayName("Test findAll returns all elements from the collection")
	@Test
	void testFindAll() {
		InvoiceRepository invRepo=new InvoiceRepositoryStub();
				
		InvoiceService service= new InvoiceService(invRepo);

		int actual= service.findAll().size();
		int expected=2;
		assertEquals(actual,expected);
		
	}
}
