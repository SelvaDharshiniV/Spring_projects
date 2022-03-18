package com.example.demo.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@FieldDefaults(level =AccessLevel.PRIVATE)
public class Patient {
 int patientId;
 String patientName;
 int age;
}
