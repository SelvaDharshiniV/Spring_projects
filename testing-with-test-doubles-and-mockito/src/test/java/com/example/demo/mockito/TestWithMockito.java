package com.example.demo.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.example.demo.stub.Invoice;
import com.example.demo.stub.InvoiceRepository;
import com.example.demo.stub.InvoiceService;


public class TestWithMockito {

	
	@Test
	void testFindAll() {
		
		InvoiceRepository repo = Mockito.mock(InvoiceRepository.class);
		
		InvoiceService service = new InvoiceService(repo);
		
		List<Invoice> invlist = Arrays.asList(new Invoice(202,"Ramki",100),new Invoice(203,"selva",101));
		
		Mockito.when(service.findAll()).thenReturn(invlist);
		
		
		assertEquals(2,service.findAll().size());
		
		
	}
	
	
}

