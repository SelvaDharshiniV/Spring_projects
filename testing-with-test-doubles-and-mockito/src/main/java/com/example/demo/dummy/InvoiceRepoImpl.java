package com.example.demo.dummy;

import java.util.*;

public class InvoiceRepoImpl implements InvoiceRepository {
	private List<Invoice> invList;

	public InvoiceRepoImpl() {
		super();
		invList=new ArrayList<>();	}

	@Override
	public int add(Invoice entity) {
		boolean result=invList.add(entity);
		return result?1:0 ;
	}

	@Override
	public Collection<Invoice> findAll() {
		return this.invList;
	}

}
