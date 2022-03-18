package com.example.demo.ifaces;

import java.util.List;

import com.example.demo.model.Doctor;

public interface DoctorRepository<T> extends CrudRepository<T> {
	public List<Doctor> findByCity(String cityName);

}
