package com.example.demo.ifaces;

import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository {
String findById(int id);
}
