package com.example.demo.model;

import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Component
@Data
//@AllArgsConstructor
@FieldDefaults(level =AccessLevel.PRIVATE)
public class Student {
int id;
String firstName;
}
