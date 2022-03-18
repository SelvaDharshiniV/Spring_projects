package com.example.demo.ifaces;
import java.util.*;

import com.example.demo.model.Doctor;
public interface CrudRepository<T> {
	public int add(T t);
	public List<T> findAll();
	public T findById(int pkey);
	public int update(T t);
	public int deleteById(int pkey);
//	List<Doctor> findByCity(String cityName);
}
