package com.example.demo.mock;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;

import com.example.demo.mock.Invoice;
import com.example.demo.mock.InvoiceRepository;

public class MockInvoiceRepository implements InvoiceRepository {
	int count=0;
	Invoice lastAdded;

	@Override
	public int add(Invoice entity) {
		count++;
		lastAdded=entity;
		return 0;
	}

	@Override
	public Collection<Invoice> findAll() {
		return null;
	}
	public void verify(Invoice inv, int total) {
		assertEquals(count,total);
		assertEquals(lastAdded,inv);
	}

}
