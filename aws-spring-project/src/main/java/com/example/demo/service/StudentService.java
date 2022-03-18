package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repos.StudentRepository;



@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repo;
	
	public Student add(Student entity) {
		return this.repo.save(entity);
	}
//	public Student findById(int id) {
//		return this.repo.findById(id).get();
//	}
//	public Optional<Student> findById(int id) {
//		return this.repo.findById(id);
//	}
	public List<Student> findAll() {
		return this.repo.findAll();
	}
//	public Optional<Student> remove(Student entity){
//		Optional<Student> value= Optional.empty();
//		if(this.repo.existsById(entity.getRollNumber())) {
//			this.repo.delete(entity);
//			value=Optional.of(entity);
//		}
//		return value;
//	}
//	public Optional<Object> removeById(int id){
//		Optional<Object> value= Optional.empty();
//		if(this.repo.existsById(id)) {
//			this.repo.deleteById(id);
//			value=Optional.of(id);
//		}
//		return value;
//	}
//	public Student updateStudent(Student entity){
//		return this.repo.save(entity);
//	}
//	public int updateMark(int rollNumber, double latestMark){
//		return this.repo.updateMark(rollNumber, latestMark);
//	}
//	public List<Student> sortByProperty(String proName){
//		Sort sort = Sort.by(proName);//.descending();
//		return this.repo.findAll(sort);
//	}
//	public List<Student> findByPage(int page, int size){
//		Pageable pageable = PageRequest.of(page, size);
//		Page<Student> list=this.repo.findAll(pageable);
//		System.out.println("Number of Page === "+list.getTotalPages());
//		System.out.println("Number of Elements === "+list.getNumberOfElements());
//		System.out.println("Total Elements=== "+list.getTotalElements());
//		if(list.hasContent()) {
//			return list.getContent();
//		}else {
//			return new ArrayList<>();
//		}
//		 
//	}
}
