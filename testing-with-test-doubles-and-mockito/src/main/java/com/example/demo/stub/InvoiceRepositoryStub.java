package com.example.demo.stub;

import java.util.Arrays;
import java.util.Collection;

import com.example.demo.stub.Invoice;
import com.example.demo.stub.InvoiceRepository;

public class InvoiceRepositoryStub implements InvoiceRepository {

	@Override
	public int add(Invoice entity) {
		return 0;
	}

	@Override
	public Collection<Invoice> findAll() {
		return Arrays.asList(new Invoice(101,"ram",999),new Invoice(102,"sam",888));
	}

}
