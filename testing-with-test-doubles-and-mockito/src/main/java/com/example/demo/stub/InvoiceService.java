package com.example.demo.stub;
import java.util.*;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class InvoiceService {
	
	private InvoiceRepository invRepo;
	
	public boolean addInvoice(Invoice entity) {
		int added=0;
		if(entity.getAmount()>500) {
			 this.invRepo.add(entity);
		}
		return added==1?true:false;
		
	}
	
	public Collection<Invoice> findAll() {
		return this.invRepo.findAll().stream()
				.collect(Collectors.toList());
//		return this.invRepo.findAll();

	}

}
