package com.example.demo.dummy;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestInvoiceService {

	@DisplayName("Test InvoiceService class addInvoice method return 1 for successful insert")
	@Test
	void testForAddSuccess() {
		InvoiceRepository inRepo= new InvoiceRepoImpl();
		EmailRepository emailRepo= new DummyEmailRepo();
				
		InvoiceService service= new InvoiceService(inRepo,emailRepo);
		
		Invoice invoice=new Invoice(1010, "Ramesh", 450);

		int actual= service.addInvoice(invoice);
		int expected=1;
		assertEquals(actual,expected);
	}
}
