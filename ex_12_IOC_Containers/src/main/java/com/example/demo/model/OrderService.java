package com.example.demo.model;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.ToString;

@ToString
@Configuration
@Component
public class OrderService {
	private List<SalesOrder> salesOrder;
@Autowired
	public OrderService(List<SalesOrder> salesOrder) {
		super();
		this.salesOrder = salesOrder;
	}
	
	public double findTotal() {
		List<Item> itemList= ((SalesOrder) salesOrder).getItemList();
		double total = 0;
		for (Item item : itemList) {
				double qty=item.getQuantity();
				double price=item.getRatePerUnit();
				total+=(qty*price);
		}
		return total;
	}
}