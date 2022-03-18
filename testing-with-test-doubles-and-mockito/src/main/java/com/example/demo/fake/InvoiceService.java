package com.example.demo.fake;
import java.util.*;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class InvoiceService {
	
	private InvoiceRepository invRepo;
	
	public int addInvoice(Invoice entity) {
		return this.invRepo.add(entity);
	}
	
	public Collection<Invoice> findAll() {
		return this.invRepo.findAll();
	}

}
