package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Product;
@Repository
public interface  ProductRepository<T extends Product> extends JpaRepository<T, Integer>  {

}
