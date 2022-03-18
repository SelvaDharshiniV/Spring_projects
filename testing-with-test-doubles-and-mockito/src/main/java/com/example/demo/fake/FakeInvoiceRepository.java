package com.example.demo.fake;

import java.util.Collection;
import java.util.HashMap;

import com.example.demo.fake.Invoice;
import com.example.demo.fake.InvoiceRepository;

public class FakeInvoiceRepository implements InvoiceRepository {

	private HashMap<Integer, Invoice> invList;
	
	public FakeInvoiceRepository() {
		super();
		invList=new HashMap<>();
	}

	@Override
	public int add(Invoice entity) {
		Invoice added= invList.put(entity.getInvoiceNumber(), entity);
		return (added!=null)?0:1;
	}

	@Override
	public Collection<Invoice> findAll() {
		return this.invList.values();
	}

}
