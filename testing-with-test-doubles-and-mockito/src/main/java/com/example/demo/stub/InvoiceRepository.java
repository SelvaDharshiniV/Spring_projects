package com.example.demo.stub;

import java.util.Collection;

public interface InvoiceRepository {
	public int add(Invoice entity);
	public  Collection<Invoice> findAll();;

}
