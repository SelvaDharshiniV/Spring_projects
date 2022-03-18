package com.example.demo.dummy;
import java.util.*;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class InvoiceService {
	
	private InvoiceRepository invRepo;
	private EmailRepository emailRepo;
	
	public int addInvoice(Invoice entity) {
		return this.invRepo.add(entity);
	}
	
	public Collection<Invoice> findAll() {
		return this.invRepo.findAll();
	}

}
