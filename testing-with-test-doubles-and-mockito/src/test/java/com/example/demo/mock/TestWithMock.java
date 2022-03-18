package com.example.demo.mock;

import org.junit.jupiter.api.Test;

public class TestWithMock {
	@Test
	public void testAdd() {
		
		MockInvoiceRepository mock= new MockInvoiceRepository();
		
		InvoiceService service= new InvoiceService(mock);
		
		Invoice inv1= new Invoice(102, "ram", 48);
		Invoice inv2= new Invoice(103, "sam", 5648);
		
		service.addInvoice(inv1);
		service.addInvoice(inv2);
		
		mock.verify(inv2, 1);

	}

}
