package com.example.demo.model;

import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Data
@FieldDefaults(level =AccessLevel.PRIVATE)
public class Item {
	long itemNumber;
	String itemName;
	double quantity ;
	double ratePerUnit;
}
